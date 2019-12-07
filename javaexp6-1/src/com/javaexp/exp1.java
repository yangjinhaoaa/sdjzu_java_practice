
package com.javaexp;
import javax.swing.*;
import java.awt.*;
		
public class exp1 extends JFrame {
	exp1(){
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		int gap =0;
		for (int i=1; i<10; i++) {
			g.drawLine(10,10+5*i,180,10+5*i);
			for (int j=0;j<=8;j++) {
				g.drawLine(40+3+j,70,40+3*j,150);
				g.drawLine(64,70,150,156);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exp1();

	}

	
}
