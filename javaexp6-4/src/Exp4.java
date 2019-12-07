import javax.swing.*;
import java.awt.*;

public class Exp4 extends JFrame{
	Exp4() {
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public void paint(Graphics g) {
		int gap=0;
		for (int i=0; i<=10; i++) {
			g.drawLine(10,10+5*i,180,10+5*i);

		}
		for(int i=0; i<=8;i++){
			g.drawLine(40+3*i,70,40+3*i,150);
		}
			g.drawLine(64,70,150,156);
	
	}
	public static void main(String args[]) {
		new Exp4 ();
	}

}
