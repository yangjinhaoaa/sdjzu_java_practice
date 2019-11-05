import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ItemListener,ActionListener {
	JCheckBox box ;
	JTextArea text;
	JButton button;
	MyFrame(String s){
		super(s);
		box=new JCheckBox("���ô����Ƿ���Ե�����С");
		text=new JTextArea(20,12);
		button=new JButton("�رմ���");
		button.addActionListener(this);
		box.addItemListener(this);
		setSize(300,200);
		setVisible(true);
		add(text,BorderLayout.CENTER);
		add(box,BorderLayout.SOUTH);
		add(button,BorderLayout.NORTH);
		setResizable(false);
		validate();
	}

	public void itemStateChanged(ItemEvent e) {
		if(box.isSelected()==true){
			setVisible(true);
		}
		else{
			setResizable(false);
		}
	}
	public void actionPerformed(ActionEvent e){
		dispose();
	}
}

public class Exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame("����");
		
	}

}
