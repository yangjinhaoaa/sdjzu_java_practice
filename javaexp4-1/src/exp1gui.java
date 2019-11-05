import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class exp1gui extends JFrame implements ActionListener{
	JTextField text;
	JButton buttonEnter,buttonQuit;
	JLabel str;
	exp1gui(){
		setBounds(100,100,300,200);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		str=new JLabel("在文本框中输入数字字符并回车或单击按钮");
		add(str);
		text=new JTextField("0",10);
		add(text);
		buttonEnter=new JButton("确定");
		buttonQuit=new JButton("清除");
		add(buttonEnter);
		add(buttonQuit);
		validate();
		buttonEnter.addActionListener(this);
		buttonQuit.addActionListener(this);
		text.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==buttonEnter||e.getSource()==text){
			double number =0;
			try {
				number =Double.valueOf(text.getText()).doubleValue();
				text.setText(""+Math.sqrt(number));
			}
			catch (NumberFormatException event) {
				text.setText("请输入字符");

			}
		}
		else if (e.getSource()==buttonQuit){
			text.setText("0");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exp1gui();

	}

}
