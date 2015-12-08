// 第三類:304-餐點費用
import java.util.Scanner;
public class JPD304 {
    public static void main(String[] args) {
        int total = 0;
        int s = 0;
        int count = 0;
        double average;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter meal dollars or enter -1 to stop: ");
        s = input.nextInt();
        while(s != -1) {
        	count++;
        	total += s;
        	System.out.print("Please enter meal dollars or enter -1 to stop: ");
        	s = input.nextInt();
        }
        System.out.println("餐點總費用:"+ total);
        System.out.printf(" %d 道餐點平均費用為: %.2f %n", count, 1.0 * total / count);
    }
}