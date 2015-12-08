// ²Ä¥|Ãþ:402-§ÀºÝ»¼°j¶¥­¼­pºâ
import java.util.Scanner;
public class JPD402 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        int num1;
        System.out.print("Input n (0 <= n <= 16):");
        num1 = keyboard.nextInt();
        while (num1 != 999) {
            System.out.printf("%d ªº¶¥­¼(§ÀºÝ»¼°j) = %d\n", num1, facTail(num1, 1));
            System.out.printf("%d ªº¶¥­¼(°j°é) = %d\n", num1, facLoop(num1, 1));
            System.out.print("Input n (0 <= n <= 16):");
            num1 = keyboard.nextInt();
        }
    }
    
    static int facTail(int n, int r) {
        if (n == 0) {
            return r;
        } else {
            return facTail((n - 1), (r * n)); 
        }
    }
    
    static int facLoop(int n, int r) {
        while (n != 0) {
            r = r * n;
            n = n - 1; 
        }
        return r;
    }
}
