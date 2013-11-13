import java.io.*;
import java.net.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;
import org.jdom2.Element;

public class Receiver {
	
	public static void main (String[] args) {
		Object obj;
		try {
			ServerSocket servSock = new ServerSocket(Integer.parseInt(args[0]));
			File file = new File("received.xml");
			FileOutputStream fos = new FileOutputStream(file);
			byte[] fileByte = new byte[10000];
			
			Socket sock = servSock.accept();
			InputStream is = sock.getInputStream();
			
			int fileSize;
			fileSize = is.read(fileByte);
			fos.write(fileByte, 0, fileSize);
			
			SAXBuilder builder = new SAXBuilder();
			Document doc = (Document)builder.build(file);
			obj = Deserialize.deserialize(doc);
			
			is.close();
			servSock.close();
			sock.close();
			fos.close();
			
			Inspector.inspect(obj, true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
			
				
			
		