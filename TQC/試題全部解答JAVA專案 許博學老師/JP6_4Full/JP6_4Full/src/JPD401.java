// �ĥ|��:401-���j�����p��
import java.util.Scanner;
public class JPD401 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        int num1;
        System.out.print("Input n (0 <= n <= 16):");
        num1 = keyboard.nextInt();
        while (num1 != 999) {
            System.out.printf("%d ������ = %d\n", num1, fac(num1));
            System.out.print("Input n (0 <= n <= 16):");
            num1 = keyboard.nextInt();
        }
    }
    
    static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * fac(n - 1)); 
        }
    }
}
