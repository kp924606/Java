package TryCatch;
import java.util.Scanner;
public class Average2 {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		double sum=0;
		int count=0;
		int number;
		while (true) {
			try {			
				System.out.print("�п�J���:");
				number=scanner.nextInt();
				if (number==0) {
					break;
				}
				sum+=number;
				count++;							
			} catch (Exception ex) {  // ��J���ǰt���`�C
				System.out.printf("���L�D��ƿ�J:%s%n",scanner.nextInt());
			}	
		}
		System.out.printf("���� %.2f%n",sum/count);
	}
}
