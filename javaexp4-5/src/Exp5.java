import javax.swing.*;
import java.awt.*;

class Mycanvas extends Canvas {
	String s;
	Mycanvas(String s) {
		this.s = s;
		setSize(90,80);
		setBackground(Color.cyan);

	}
	public void paint(Graphics g) {
		if(s.equals("circle"))
			g.drawOval(20,35,20,20);
		else if(s.equals("rect"))
			g.drawRect(30,35,20,20);
	}
}

public class Exp5 extends JFrame{
	Mycanvas canvas1,canvas2;
	Exp5(){
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		canvas1 = new Mycanvas("circle");
		canvas2 = new Mycanvas("rect");
		add(canvas1);
		JPanel p= new JPanel();
		p.setBackground(Color.pink);
		p.add(canvas2);
		add(p);
		validate();

	}
	public static void main(String[] args) {
		new Exp5();

	}

}
