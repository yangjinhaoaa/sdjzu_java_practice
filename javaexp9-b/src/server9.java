import java.io.*;
import java.net.*;

public class server9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server=null;
		Socket you=null;
		String s=null;
		DataOutputStream out=null;
		DataInputStream in=null;
		try {
			server=new ServerSocket(4331);
		}
		catch (IOException e1) {
			System.out.println("ERROR"+e1);
		}
		try {
			you=server.accept();
			in=new DataInputStream(you.getInputStream());
			out=new DataOutputStream(you.getOutputStream());
			while (true) {
				s=in.readUTF();
				out.writeUTF("hello im server");
				out.writeUTF("your number is"+s);
				System.out.println("server accepts"+s);
				Thread.sleep(500);
			}
		}
		catch (IOException e) {
			System.out.println(""+e);
		}
		catch(InterruptedException e) {}
	}

}
