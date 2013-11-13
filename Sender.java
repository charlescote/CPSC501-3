import java.io.*;
import java.net.*;
import org.jdom2.*;
import org.jdom2.output.*;

public class Sender {
	
	public static void main (String[] args) {
		Object obj;
		Socket sock;
		
		ObjectCreator objC = new ObjectCreator();
		obj = objC.getObj();
		try {
			Document doc = Serializer.serializeObject(obj);
			FileOutputStream fos = new FileOutputStream("output.xml");
			XMLOutputter xo = new XMLOutputter();
			xo.output(doc, fos);
			fos.close();

			File file = new File("output.xml");
			FileInputStream fis = new FileInputStream(file);
			int fileSize = fis.available();
			byte[] fileByte = new byte[fileSize];
			fis.read(fileByte);
			fis.close();
			sock = new Socket(InetAddress.getByName(args[0]), Integer.parseInt(args[1]));
			OutputStream os = sock.getOutputStream();
			os.write(fileByte, 0, fileSize);
			sock.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
		