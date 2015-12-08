// 材摸:404-患癹程そ计
import java.util.Scanner;
public class JPD404 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        int num1, num2;
        System.out.print("Input m: ");
        num1 = keyboard.nextInt();
        while (num1 != 999) {
            System.out.print("Input n: ");
            num2 = keyboard.nextInt();
            System.out.println("程そ计: " + gcd(num1,num2));
            System.out.print("Input m: ");
            num1 = keyboard.nextInt();
        }
    }
    
    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
