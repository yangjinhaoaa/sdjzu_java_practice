import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mutithexp1 extends JFrame implements Runnable {
	Thread 红色球,蓝色球;
	Graphics redpen,bluepen;
	double t=0;
	//重写构造函数
	Mutithexp1(){
		setTitle("自由落体与平抛运动");
		setBounds(100,100,300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		红色球=new Thread(this);
		蓝色球=new Thread(this);
		redpen=getGraphics();
		bluepen=getGraphics();
		redpen.setColor(Color.red);
		bluepen.setColor(Color.blue);
		红色球.start();
		蓝色球.start();
	}
	public void run() {
		while (true) {
			t=t+0.2;
			if (Thread.currentThread()==红色球){
				if(t>20)
					t=0;
				redpen.clearRect(0,0,38,300);
				redpen.fillOval(20,(int)(1.0/2*t*t*3.8),16,16);
				try {
					红色球.sleep(50);
				}
				catch(InterruptedException e){}
			}
			else if (Thread.currentThread()==蓝色球){
				bluepen.clearRect(38,0,500,300);
				bluepen.fillRect(38+(int)(16*t),(int)(1.0/2*t*t*3.8),16,16);
				try {
					蓝色球.sleep(50);
				}
				catch(InterruptedException e){}
			}
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mutithexp1();

	}

}
