
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Mypanel extends JPanel implements ActionListener{
	JButton button1,button2,button3;
	Color backgroundColor;
	Mypanel(){
		button1 = new JButton("确定");
		button2=new JButton("取消");
		button3=new JButton("保存");
		add(button1);
		add(button2);
		add(button3);
		setBackground(Color.pink);
		backgroundColor = getBackground();
		button1.addActionListener(this);
		button2.addActionListener(this);

	}	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button1){
			setBackground(Color.cyan);
				}

			else if(e.getSource()==button2){
				setBackground(backgroundColor);
		}


	}
}
	
public class Exp4 extends JFrame{
	Mypanel panel1,panel2,panel3;
	JButton button;
	Exp4(){
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		panel1 = new Mypanel();
		panel2 = new Mypanel();
		panel3 = new Mypanel();
		button = new JButton("我不在里面");
		add(panel1);
		add(panel2);
		add(panel3);
		add(button);
		validate();

	}


	public static void main(String[] args) {
		
		new Exp4();
		
	}

}
