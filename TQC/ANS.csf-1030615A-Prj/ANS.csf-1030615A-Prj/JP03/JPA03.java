package JP03;
import java.util.Scanner;
public class JPA03 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int n, i = 2, sum = 0;
        do {
            System.out.printf("�п�J n ���� (n > 0�A�B������): ");
            n = keyboard.nextInt();
        } while (n <= 0 || n % 2 == 1);
        do {
            sum += i;
            i += 2;
        } while (i <= n);
        System.out.printf("2+4+...+%d=%d\n",n,sum);
    }
}
