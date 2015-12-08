// 第一類:102-單位換算
import java.util.Scanner;
public class JPD102 {
    public static void main(String[] args){
    	System.out.print("Please input: ");
    	Scanner keyin = new Scanner(System.in);
    	double w = keyin.nextDouble();
    	System.out.printf("%f kg = %f ponds\n", w, w*2.20462);
    }
}
