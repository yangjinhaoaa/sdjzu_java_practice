package objectinteractive;

public class Clock {

	private Display minute = new Display(59);
	private Display hour = new Display(24);

	void start() {
		while (true) {
			minute.increase();
			if (minute.getvalue() == 0) {
				hour.increase();
			}
			System.out.printf("%02d:%02d\n",hour.getvalue(),minute.getvalue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock a = new Clock();
		a.start();

	}

}
