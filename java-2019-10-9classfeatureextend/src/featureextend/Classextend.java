package featureextend;
//以下是父类
class Fatherclass{
	Fatherclass(){
		System.out.println("这是构造方法的输出");		//构造方法:方法名与类名一致,可以有参数,可以方法重载,不能有return,没有void修饰
	}
	
	void printastring(String str) {		//父类中的方法用default修饰的方法
		System.out.println(str);
	}
	void printastring() {		//父类中的方法用default修饰的方法
		System.out.println("无参数的方法,即printastring的方法重载");
	}
	protected void printhello() {		//父类中用proteced修饰的父方法;protect修饰的可以用于子类
		System.out.println("hello");		
		
	}
}
//以下是子类
class Sonclass extends Fatherclass  {
	void sunsprint() {
		System.out.println("子类的方法");
	}
}

public class Classextend {

	public static void main(String[] args) {
		Sonclass aobject=new Sonclass();		//这里会调用构造方法
		aobject.printastring("fatherprint");	//程序26行new的是子对象,但是它继承了父对象的方法
		aobject.printastring();					//同一个方法但不同参数的方法的重载 多态性
		aobject.printhello();					//父类中用protected关键字修饰的方法是可以继承到子类的
		aobject.sunsprint();                    //子类的方法也可以被调用
	}

}
