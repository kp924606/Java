import java.util.Scanner;
public class LearningSring2 {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {		
		long sum=0;
		long number=0;
		do
		{
			System.out.print("��J�Ʀr�G");
			number=Long.parseLong(scanner.nextLine());
			sum+=number;
		}while(number!=0);
		System.out.println("�`�M�G"+sum);
	}
}