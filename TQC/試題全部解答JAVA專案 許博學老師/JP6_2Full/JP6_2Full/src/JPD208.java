// 第二類:208-分級限制
import java.util.*;
class JPD208 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        test();
    }
  
    public static void test() {
        System.out.println("Input:");
        int k = keyboard.nextInt();
        
        if(k >= 90) System.out.println("Your grade is A");
        else if(k >= 80) System.out.println("Your grade is B");
        else if(k >= 70) System.out.println("Your grade is C");
        else if(k >= 60) System.out.println("Your grade is D");
        else System.out.println("Your grade is F");
    }
}
