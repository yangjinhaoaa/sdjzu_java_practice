//switch���
public class exp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean leap;
	    int year=2005;
	    if ((year%4==0 && year%100!=0) || (year%400==0)) // ����1
	     System.out.println(year+" ��������");
	    else
	     System.out.println(year+" �겻������");
	    year=2008; // ����2
	    if (year%4!=0)
	     leap=false;
	    else if (year%100!=0)
	     leap=true;
	    else if (year%400!=0)
	     leap=false;
	    else
	     leap=true;
	    if (leap==true)
	     System.out.println(year+" ��������");
	    else
	     System.out.println(year+" �겻������");
	    year=2050; // ����3
	    if (year%4==0) {
	     if (year%100==0) {
	      if (year%400==0)
	       leap=true;
	      else
	       leap=false;
	     }
	     else
	      leap=false;
	    }
	    else
	     leap=false;
	    if (leap==true)
	     System.out.println(year+" ��������");
	    else
	     System.out.println(year+" �겻������");

	}

}
