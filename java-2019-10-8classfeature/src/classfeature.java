class Aclass {
	public void output() {
		System.out.println("class father");
	}
	private void privateoutput() {
		System.out.println("classË½ÓÐ·½·¨");
	}
	public void getprivateoutput() {
		privateoutput();
	}
	
}

public class classfeature {

	public static void main(String[] args) {

		Aclass father1 = new Aclass();
		father1.output();
		father1.getprivateoutput();
	}

}
