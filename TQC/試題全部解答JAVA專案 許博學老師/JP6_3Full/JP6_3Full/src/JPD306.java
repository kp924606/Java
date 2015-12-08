// 第三類:306-迴圈次方計算
import java.util.*;
public class JPD306 {
    public static void main (String argv[]){
        int num1, num2;
  
        Scanner input = new Scanner(System.in);
        System.out.println("Input:"); 
        num1 = input.nextInt();
        while (num1 != 999) {
            num2 = input.nextInt();
            System.out.println(powerOf(num1, num2));
            System.out.println("Input:"); 
            num1 = input.nextInt();
        }
    }  
  
    static long powerOf (int m, int n) {
        int i;
        long p=1;
        for(i=1; i<=n; i++) {
        	p *= m;
        }
        return p;
    }
}
