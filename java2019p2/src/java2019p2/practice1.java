/*this program is a transfer of inch and meter
 * 
 */

package java2019p2;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		double result;
		Scanner in =new Scanner(System.in);
		System.out.println("请输入英尺数");
		
		foot=in.nextInt();
		
		System.out.println("请输入英寸数");
		
		inch=in.nextInt();
		//计算过程
		result=(foot+inch/12)*0.3048;
		
		System.out.println("The answer is "+result+" meter");
		//除号两端有一个是浮点数才能够输出浮点数
		System.out.println(5/3);
		System.out.println(5/3.0);
		//浮点数运算有误差		
		System.out.println(1.2-1.1);

	}

}
