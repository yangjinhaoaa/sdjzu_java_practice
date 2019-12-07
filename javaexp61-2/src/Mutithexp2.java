
public class Mutithexp2 {

	
	

	public static void main(String[] args) {
		Lefthand left;
		Righthand right;
		left = new Lefthand();
		right = new Righthand();
		left.start();
		right.start();
	}

}
class Lefthand extends Thread {
	public void run(){
		for (int i=1;i<=100;i++){
			System.out.print("A");
			try {
				sleep(500);
			}catch (InterruptedException e){

			}
		}
	}
}
class Righthand extends Thread {
	public void run(){
		for (int i=1;i<=100;i++){
			System.out.print("B");
			try {
				sleep(300);

			}catch(InterruptedException e){
			}
		}
	}
}
