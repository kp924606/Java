// 第三類:305-迴圈階乘計算
import java.util.Scanner;
public class JPD305 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
    }
    
    public static void test() {
        System.out.print("Please enter one value: ");
        int s = keyboard.nextInt();
        int i, p=1;
        if(s >= 1 && s <= 10) {
        	for(i=1;i<=s;i++){
        		p *= i;
        	}
        	System.out.println(s + "!:" + p);
        }else {
        	System.out.println("Error, the value is out of range.");
        }
    }
}