package featureextend;
//�����Ǹ���
class Fatherclass{
	Fatherclass(){
		System.out.println("���ǹ��췽�������");		//���췽��:������������һ��,�����в���,���Է�������,������return,û��void����
	}
	
	void printastring(String str) {		//�����еķ�����default���εķ���
		System.out.println(str);
	}
	void printastring() {		//�����еķ�����default���εķ���
		System.out.println("�޲����ķ���,��printastring�ķ�������");
	}
	protected void printhello() {		//��������proteced���εĸ�����;protect���εĿ�����������
		System.out.println("hello");		
		
	}
}
//����������
class Sonclass extends Fatherclass  {
	void sunsprint() {
		System.out.println("����ķ���");
	}
}

public class Classextend {

	public static void main(String[] args) {
		Sonclass aobject=new Sonclass();		//�������ù��췽��
		aobject.printastring("fatherprint");	//����26��new�����Ӷ���,�������̳��˸�����ķ���
		aobject.printastring();					//ͬһ����������ͬ�����ķ��������� ��̬��
		aobject.printhello();					//��������protected�ؼ������εķ����ǿ��Լ̳е������
		aobject.sunsprint();                    //����ķ���Ҳ���Ա�����
	}

}
