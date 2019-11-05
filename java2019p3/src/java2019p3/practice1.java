//this program is compare
//关系运算符


package java2019p3;


import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5==3);
		System.out.println(3==3);
		System.out.println(5!=3);
		System.out.println(5>3);
		
		int a,b;
		
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("请输入第1个比较数");
		a= in.nextInt();
		
		System.out.println("请输入第2个比较数");
		b= in.nextInt();
		


		if (a==b) {
			System.out.println("equal!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
		}
		else
		{
			System.out.println("diffient×××××××××××××××××××××××××××××");
		}

	}

}
