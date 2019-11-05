//售票机程序

package java2019p3;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		
		System.out.println("请投币\nprice is 6 yuan ");
		int input;
		input=in.nextInt();
		if(input>6) {

			System.out.println("出票1张找您 "+(input-6)+" yuan");
	
				
		}
		else
		{
			System.out.println("钱不够还差 "+(6-input)+" yuan");
		}

	}

}
