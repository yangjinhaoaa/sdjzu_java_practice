package objectinteractive;

public class Display {
	private int limit = 0;
	private int value = 0;

	public Display(int limit) {
		this.limit = limit;
	}

	public void increase() {
		value++;
		if (value == limit) {
			value = 0;
		}
	}

	public int getvalue() {
		return value;
	}

	public static void main(String[] args) {
		Display minute = new Display(59);
		for (;;) {
			minute.increase();
			System.out.println(minute.getvalue());
		}
	}

}
