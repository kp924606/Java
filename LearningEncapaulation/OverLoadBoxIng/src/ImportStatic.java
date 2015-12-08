import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class ImportStatic {
	public static Scanner scanner=new Scanner(in);
	public static void main(String[] args) {
		out.print("請輸入姓名：");
		out.printf("%s 您好!%n",scanner.nextLine());
	}
}
