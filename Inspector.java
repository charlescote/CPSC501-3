import java.util.*;
import java.lang.reflect.*;


public class Inspector
{

	public static void inspect(Object obj, boolean recursive)
	{
		Class ObjClass = obj.getClass();
		Vector objectsToInspect = new Vector();
		
		System.out.println("Inspecting: " + obj + " (recursive = " + recursive + ")");
		
		//inspect the current class
		inspectFields(obj, ObjClass, objectsToInspect, recursive);
		
		if(recursive)
			inspectFieldClasses(obj, ObjClass, objectsToInspect, recursive);
			
	}



	private static void inspectFieldClasses(Object obj, Class ObjClass, Vector objectsToInspect, boolean recursive)
    {
		if(objectsToInspect.size() > 0 ) {
			System.out.println();
			System.out.println("---- Inspecting Field Classes of " + ObjClass.getName() + " ----");
			System.out.println();
		}
	
		Enumeration e = objectsToInspect.elements();
		
		while(e.hasMoreElements())
		{
			Field f = (Field) e.nextElement();
			try {
				if (f.get(obj) != null) {
					System.out.println("Inspecting Field " + f.getName() + " of Object " + obj);
	
					System.out.println("******************");
					inspect(f.get(obj), recursive);
					System.out.println("******************");
					System.out.println();
				}
			} catch(Exception exp) { exp.printStackTrace(); }
	    }
    }

	
	
	private static void inspectFields(Object obj, Class ObjClass, Vector objectsToInspect, boolean recursive)
	{
	
		System.out.println();
		for (Constructor c : ObjClass.getConstructors()) {
			System.out.println("Constructor: " + c.getName());
			System.out.println("- modifier: " + Modifier.toString(c.getModifiers()));
			System.out.print("- parameter types: ");
			for (Class p : c.getParameterTypes()) {
				System.out.print(p.getName() + " ");
			}
			System.out.println();
		}
		for (Method m : ObjClass.getDeclaredMethods()) {
			System.out.println("Method: " + m.getName());
			System.out.println("- return: " + m.getReturnType().getName());
			System.out.println("- modifier: " + Modifier.toString(m.getModifiers()));
			System.out.print("- parameter types: ");
			for (Class p : m.getParameterTypes()) {
				System.out.print(p.getName() + " ");
			}
			System.out.println();
			for (Class e : m.getExceptionTypes()) {
				System.out.println("   - Exception: " + e.getName());
			}
		}
		for (Field f : ObjClass.getDeclaredFields()) {
			try {
				f.setAccessible(true);
				System.out.println("Field: " + f.getName() + " = " + f.get(obj));
				System.out.println("- type: " + f.getType());
				System.out.println("- modifier: " + Modifier.toString(f.getModifiers()));
				if(!f.getType().isPrimitive()) {
					objectsToInspect.addElement( f );
				}
			} catch (Exception e) {System.out.println(e);}
		}
		
	}
}

