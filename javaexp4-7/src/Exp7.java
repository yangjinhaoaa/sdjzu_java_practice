import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Herwindow extends JFrame implements ActionListener
{	JMenuBar menubar;JMenu menu;JMenuItem item;
	Herwindow(String s)
	{	super(s);
		setSize(300,170);
		setVisible(true);
		menubar=new JMenuBar();
		menu=new JMenu("�ļ�");
		item=new JMenuItem("�˳�");
		item.addActionListener(this);
		menu.add(item);
		menubar.add(menu);menubar.add(menu);
		setJMenuBar(menubar);
		validate();
	}
	public void actionPerformed(ActionEvent e)
	{	if(e.getSource()==item)
		{	System.exit(0);
		}
	}
}
public class Exp7 {
	public static void main(String args[])
	{	Herwindow window=new Herwindow("����֮��");
	}
}



