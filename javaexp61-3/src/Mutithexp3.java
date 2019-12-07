import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.Panel;  

import javax.swing.JFrame;  

public class Mutithexp3 {  

    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        JFrame win=new JFrame();//新建窗口  
        win.setLocation(250,100);//设置窗口位置  
        win.setSize(800,600);//设置窗口大小  
        win.setVisible(true);//显示窗口  
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭退出  
        MyPanel my=new MyPanel();  
        win.add(my);  
        Thread t=new Thread(my);  
        t.start();  
    }  

}  

class MyPanel extends Panel implements Runnable{  
        int x=0,y=0;  
        int flyx=1,flyy=1;  
    public void paint(Graphics g) {  
        g.setColor(Color.yellow);  
        g.fillOval(x, y, 70, 70);  
    //  System.out.println("23");  
        if (flyx==1) {  
            x++;  
        }  
        if(flyx ==2) {  
            x--;  
        }  
        if(flyy==1) {  
            y++;  
        }  
        if(flyy==2) {  
            y--;  
        }  
        if(x>730) {  
            flyx=2;  
        }  
        if(x<0) {  
            flyx=1;  
        }  
        if(y<0) {  
            flyy=1;  
        }  
        if(y>530) {  
            flyy=2;  
        }  
    }  
    public void run() {  
        while(true){  
            repaint();  
            try {  

                Thread.sleep(10);  
            }  
            catch(Exception e) {  

            }  
        }  
    }  
}  