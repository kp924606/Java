// 第二類:203-判斷奇偶數
import java.util.*;
public class JPD203 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    
    static void test() {
        System.out.println("Input an integer:");
        int k = input.nextInt();
        
        if(k % 2 == 1) System.out.println("The number is odd.");
        else System.out.println("The number is even.");
    }
}
