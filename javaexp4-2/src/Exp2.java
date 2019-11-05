import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Exp2 extends JFrame implements ActionListener {
	JTextField text1,text2;
	JPasswordField passwordtext;
	Exp2(){
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		text1 = new JTextField("输入密码",10);
		text1.setEditable(false);
		passwordtext=new JPasswordField(10);
		passwordtext.setEchoChar('*');
		text2=new JTextField("我是一个文本框",20);

		add(text1);
		add(passwordtext);
		add(text2);
		validate();
		passwordtext.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
		text1.setText("设置的密码为:"+passwordtext.getText());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exp2();

	}

}
