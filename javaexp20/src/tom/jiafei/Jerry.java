package tom.jiafei;

import tom.jiafei.Father;

public class Jerry extends Father {
	public Jerry() {
		super(20);
	}

	public static void main(String args[]) {
		Jerry Jerry = new Jerry();
		Jerry.height = 12;
		Jerry.weight = 200;
		Jerry.money = 800;
		int m = Jerry.getMoney();
		Jerry.setMoney(300);
		System.out.println("m=" + m);
	}
}
