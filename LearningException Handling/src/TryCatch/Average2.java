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
				System.out.print("請輸入整數:");
				number=scanner.nextInt();
				if (number==0) {
					break;
				}
				sum+=number;
				count++;							
			} catch (Exception ex) {  // 輸入不匹配異常。
				System.out.printf("略過非整數輸入:%s%n",scanner.nextInt());
			}	
		}
		System.out.printf("平均 %.2f%n",sum/count);
	}
}
