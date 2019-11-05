
//循环
public class exp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,c;
		System.out.println("摄氏温度 \t 华氏温度");
		for (c=0; c<=40; c+=5) {
			h=c*9/5+32;
			System.out.println("\t"+c+"\t"+h);
		}
		

	}

}
