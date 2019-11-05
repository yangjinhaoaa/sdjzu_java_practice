package tom.jiafei;

public class Father {

	int height;
	protected int money;
	public int weight;

	public Father(int m) {
		money = m;
	}

	protected int getMoney() {
		return money;
	}

	void setMoney(int newMoney) {
		money = newMoney;
	}
}
