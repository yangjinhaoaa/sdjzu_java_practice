package javaexp21;
interface ShowMessage{
    void ��ʾ�̱�(String s);
}
class TV implements ShowMessage{
    public void ��ʾ�̱�(String s)
    {System.out.println(s);
    }
}
class PC implements ShowMessage{
    public void ��ʾ�̱�(String s)
    {System.out.println(s);
    }
}
public class javaexp21{
    public static void main(String[] args)
    {ShowMessage sm;
    sm=new TV();
    sm.��ʾ�̱�("�����Ƶ��ӻ�");
    sm=new PC();
    sm.��ʾ�̱�("���뱼��5008PC��");
    }
}

