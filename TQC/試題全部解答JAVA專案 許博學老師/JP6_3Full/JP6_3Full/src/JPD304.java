// �ĤT��:304-�\�I�O��
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
        System.out.println("�\�I�`�O��:"+ total);
        System.out.printf(" %d �D�\�I�����O�ά�: %.2f %n", count, 1.0 * total / count);
    }
}