import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exp6 extends JFrame{
	Exp6 ()
	{
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(12,12));
		JButton button[][]=new JButton[12][12];
		for(int i=0;i<12;i++)
		{	for(int j=0;j<12;j++)
			{	button[i][j]=new JButton();
				if((i+j)%2==0)
					button[i][j].setBackground(Color.black);
				else
					button[i][j].setBackground(Color.white);
				add(button[i][j]);
			}
		}
		validate();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exp6 ();
	}

}
