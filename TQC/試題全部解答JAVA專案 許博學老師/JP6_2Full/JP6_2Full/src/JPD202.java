// �ĤG��:202-����j�p
import java.util.*;
class JPD202 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    
    public static void test() {
        System.out.println("Input:");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        
        
        if (num1 > num2) {
            System.out.println(num1+" is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2+ " is larger than " + num1);
        } else {
            System.out.println(num1+" and "+num2+" are equal.");
        }
    }
}
