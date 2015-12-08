// 第二類:201-分數篩選
import java.util.Scanner;
public class JPD201 {
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        test();
        test();
    }
    
    public static void test() {
        System.out.println("Please enter score:");
        int k = keyboard.nextInt();
        
        if(k >= 60) System.out.println("You pass");
        
        System.out.println("End");
    }
}
