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
		System.out.println("������Ӣ����");
		
		foot=in.nextInt();
		
		System.out.println("������Ӣ����");
		
		inch=in.nextInt();
		//�������
		result=(foot+inch/12)*0.3048;
		
		System.out.println("The answer is "+result+" meter");
		//����������һ���Ǹ��������ܹ����������
		System.out.println(5/3);
		System.out.println(5/3.0);
		//���������������		
		System.out.println(1.2-1.1);

	}

}
