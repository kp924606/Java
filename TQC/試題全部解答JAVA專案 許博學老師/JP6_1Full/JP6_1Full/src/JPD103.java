// 第一類:103-計算平均值
import java.util.Scanner;

public class JPD103 {
    public static void main(String[] args){
    	System.out.println("Please input: ");
    	Scanner keyin = new Scanner(System.in);
    	int a,b,c;
    	a = keyin.nextInt();
    	b = keyin.nextInt();
    	c = keyin.nextInt();
    	System.out.printf("Average: %.2f\n", (a+b+c)/3.0);
    }
}
