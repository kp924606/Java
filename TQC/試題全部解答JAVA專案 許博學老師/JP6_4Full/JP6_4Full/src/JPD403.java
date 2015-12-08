// ²Ä¥|Ãþ:403-§ÀºÝ»¼°j¦¸¤è­pºâ
import java.util.Scanner;
public class JPD403 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        int num1, num2;
        System.out.print("Input m:");
        num1 = keyboard.nextInt();
        while (num1 != 999) {
            System.out.print("Input n:");
            num2 = keyboard.nextInt();
            System.out.println("Ans¡]§ÀºÝ»¼°j¡^: " + powerTail(num1,num2, 1));
            System.out.println("Ans¡]°j°é¡^: " + powerLoop(num1,num2, 1));
            System.out.print("Input m:");
            num1 = keyboard.nextInt();
        }
    }
    
    static int powerTail(int m, int n, int r) {
        if (n == 0) {
            return r;
        } else {
            return powerTail(m, n - 1, m * r);
        }
    }
    
    static int powerLoop(int m, int n, int r) {
        while (n != 0) {
            r = m * r;
            n = n - 1;
        }
        return r;
    }
}
