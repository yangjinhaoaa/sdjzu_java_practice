//��Ʊ������

package java2019p3;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		
		System.out.println("��Ͷ��\nprice is 6 yuan ");
		int input;
		input=in.nextInt();
		if(input>6) {

			System.out.println("��Ʊ1������ "+(input-6)+" yuan");
	
				
		}
		else
		{
			System.out.println("Ǯ�������� "+(6-input)+" yuan");
		}

	}

}
