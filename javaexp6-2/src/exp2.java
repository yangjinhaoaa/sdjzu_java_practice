import javax.swing.*;
import java.awt.*;



public class exp2 extends JFrame{
	exp2() {
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		g.drawRect(44,42,60,60);
		g.drawRoundRect(30,30,90,60,50,30);
		g.setColor(Color.cyan);
		g.fillOval(20,100,120,60);
		int k=0;
		for (int i=0; i<=8;i++){
			Color c=new Color(i*32-1,0,0);
			g.setColor(c);
			k=k+5;
			g.drawOval(160+k,77+k,120-2*k,80-2*k);

		}
	}
	public static void main(String args[]){
		new exp2 ();
	}
}

