// �Ĥ@��:104-�Z���p��
import java.util.Scanner;


public class JPD104 {
    public static void main(String[] args){
    	Scanner keyin = new Scanner(System.in);
    	int x1,y1,x2,y2;
    	System.out.print("��J��1�ժ� x �M y �y�СG");
    	x1 = keyin.nextInt();
    	y1 = keyin.nextInt();
    	System.out.print("��J��2�ժ� x �M y �y�СG");
    	x2 = keyin.nextInt();
    	y2 = keyin.nextInt();
    	System.out.printf("����(%.2f,%.2f)�M(%.2f,%.2f)�������Z���O%.2f�C"
    			,x1*1.0, y1*1.0, x2*1.0, y2*1.0, 
    			Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,  2)));
    }
}
