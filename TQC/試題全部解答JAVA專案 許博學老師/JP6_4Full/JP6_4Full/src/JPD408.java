// �ĥ|��:408-���j�r��ϦV
import java.util.Scanner;
public class JPD408 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c; 
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
    }
    
    public static String reverse(String str) {
        if (str.equals("")) {
            return "";
        } else {
            return reverse(str.substring(1)) + str.substring(0, 1);
        }
    }
}
