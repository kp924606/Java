package TryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Average {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			double sum=0;
			int count=0;
			int number;
			while (true) {
				System.out.print("�п�J���:");
				number=scanner.nextInt();
				if (number==0) {
					break;
				}
				sum+=number;
				count++;
			}
			System.out.printf("���� %.2f%n",sum/count);
		} catch (InputMismatchException ex) {  // ��J���ǰt���`�C
			System.out.println("������J���!");
		}		
	}
}
