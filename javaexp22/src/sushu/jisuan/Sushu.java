package sushu.jisuan;

public class Sushu {


		public static void shuchu() {
			int i, j;
			for (i = 1; i < 50; i++)
				for (j = 2; j <= i; j++) {
					if ((i % j) != 0)
						;
					else if (j == i) {
						System.out.println(+j);
					} else
						break;
				}
		}

	public static void main(String[] args) {
	
		Sushu.shuchu();
	}

}
