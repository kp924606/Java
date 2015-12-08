// 第四類:409-遞迴字串移除
import java.util.Scanner;
public class JPD409 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c; 
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.print("Input a character: ");
        c = keyboard.nextLine();
        System.out.printf("%s\n", removeChar(s, c));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.print("Input a character: ");
        c = keyboard.nextLine();
        System.out.printf("%s\n", removeChar(s, c));
    }
    
    public static String removeChar(String str, String c) {
        if (str.equals("")) {
              return "";
        } else if (str.substring(0, 1).equals(c)) {
            return removeChar(str.substring(1), c);
        } else {
            return str.substring(0, 1) + removeChar(str.substring(1), c);
        }
    }
}
