// 第三類:307-迴圈最大公因數
import java.io.*;
public class JPD307 {
    public static void main (String argv[]) throws NumberFormatException, IOException{
        int num1, num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input:"); 
        num1 = Integer.parseInt(br.readLine());
        
        while (num1 != 999) {
            num2 = Integer.parseInt(br.readLine());
            System.out.println(gcd(num1, num2));
            System.out.println("Input:"); 
            num1 = Integer.parseInt(br.readLine());
        }
    }  
  
    static int gcd (int m, int n) {
        int result = n;
        while (m % n != 0){
             result = m % n;
             m = n;
             n = result;
        }
        return result;
    }
}