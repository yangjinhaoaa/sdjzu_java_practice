interface ShowMessage{
	void ��ʾ�̱�(String s);
}
class TV implements ShowMessage{
	public void ��ʾ�̱�(String s) {
		System.out.println(s);
	}
}
class PC implements ShowMessage{
	public void ��ʾ�̱�(String s){
		System.out.println(s);
	}
}

public class exp3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowMessage sm;
		sm = new TV();
		sm.��ʾ�̱�("长城电视");
		sm=new PC();
		sm.��ʾ�̱�("联想本月");
	}

}
