// �Ĥ@��:105-�s����
import java.util.Scanner;


public class JPD105 {
    public static void main(String[] args){
    	Scanner keyin = new Scanner(System.in);
    	int x1,x5,x10,x50;
    	String name;
    	System.out.print("�п�J�p�ĩm�W�G");
    	name = keyin.nextLine();
    	System.out.println("Hi, " + name + ",�п�J�A���ɪO���ӼơG");
    	
    	System.out.print("�п�J1�����ƶq�G");
    	x1 = keyin.nextInt();
    	System.out.print("�п�J5�����ƶq�G");
    	x5 = keyin.nextInt();
    	System.out.print("�п�J10�����ƶq�G");
    	x10 = keyin.nextInt();
    	System.out.print("�п�J50�����ƶq�G");
    	x50 = keyin.nextInt();
//    	System.out.println("�z�����`�@���G" + (x1+x5*5+x10*10+x50*50) + "��");
    	
    	int s = x1+x5*5+x10*10+x50*50;
//    	System.out.println("�z�����`�@���G" + s/1000 + " �d  " + 
//    	  s%1000/100 + " ��  " + s%1000%100/10 + " �Q  " + s%10 + " ��");

    	System.out.println("�z�����`�@���G" + s/1000 + " �d  " + 
    	    	  s%1000/100 + " ��  " + s%100/10 + " �Q  " + s%10 + " ��");
}
}
