import java.io.*;
import java.net.*;

public class Client9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		Socket mysocket;
		DataInputStream in=null;
		DataOutputStream out=null;
		try {
			mysocket=new Socket("localhost", 4331);
			in=new DataInputStream(mysocket.getInputStream());
			out=new DataOutputStream(mysocket.getOutputStream());
			out.writeUTF("nihao");
			while(true) {
				s=in.readUTF();
				out.writeUTF(":"+Math.random());
				System.out.println("Client9 get you message"+s);
				Thread.sleep(500);
			}
		}
		catch (IOException e) {
			System.out.println("cant connect");

		}
		catch(InterruptedException e) {
			
		}
	}

}
