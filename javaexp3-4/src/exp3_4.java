interface ShowMessage{
	void 显示商标(String s);
}
class TV implements ShowMessage{
	public void 显示商标(String s) {
		System.out.println(s);
	}
}
class PC implements ShowMessage{
	public void 显示商标(String s){
		System.out.println(s);
	}
}

public class exp3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowMessage sm;
		sm = new TV();
		sm.显示商标("闀垮煄鐢佃");
		sm=new PC();
		sm.显示商标("鑱旀兂鏈湀");
	}

}
