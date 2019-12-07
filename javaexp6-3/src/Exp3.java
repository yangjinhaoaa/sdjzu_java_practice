import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp3 extends JFrame implements ActionListener{
	JTextField text;
	JButton buttonEnter,buttonQuit;
	JLabel str;
	Exp3() {
		setBounds(100,100,300,200);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		str=new JLabel("���ı����������ַ�������");
		add(str);
		text=new JTextField("0",10);
		add(text);
		buttonEnter=new JButton("ȷ��");
		buttonQuit=new JButton("ȡ��");
		add(buttonEnter);
		add(buttonQuit);
		validate();
		buttonEnter.addActionListener(this);
		buttonQuit.addActionListener(this);
		text.addActionListener(this);


	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==buttonEnter||e.getSource()==text){
			double number=0;
			try {
				number=Double.valueOf(text.getText()).doubleValue();
				text.setText(""+Math.sqrt(number));

			}
			catch(NumberFormatException event) {
				text.setText("�������ַ�");

			}
		}
		else if(e.getSource()==buttonQuit){
			text.setText("0");

		}
	}
	public static void main(String[] args) {
		new Exp3 ();
	}

}