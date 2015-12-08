// 第四類:405-遞迴函數
import java.util.Scanner;
public class JPD405 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        int n; 
        System.out.print("Input the number n: ");
        n = keyboard.nextInt();
        System.out.printf("Ans: %d\n",sum2(n));
    }
    
    static int sum2(int n) {
        if (n == 1) {
            return 2;
        } else {
            return (sum2(n - 1) + 2 * n);
        }
    }
}
