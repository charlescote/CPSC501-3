import java.io.*;
import java.net.*;

public class Receiver {
	
	public static void main (String[] args) {
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
			
			is.close();
			servSock.close();
			sock.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
			
				
			
		