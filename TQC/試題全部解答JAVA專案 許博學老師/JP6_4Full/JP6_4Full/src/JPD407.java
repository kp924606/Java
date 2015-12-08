// ²Ä¥|Ãþ:407-§ÀºÝ»¼°j­pºâÁ`©M
import java.util.Scanner;
public class JPD407 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s; 
        System.out.print("Input a string of numbers: ");
        s = keyboard.nextLine();
        System.out.printf("§ÀºÝ»¼°j¡G%d\n", sumTail(s, 0));
        System.out.printf("°j°é¡G%d\n", sumLoop(s, 0));
        System.out.print("Input a string of numbers: ");
        s = keyboard.nextLine();
        System.out.printf("§ÀºÝ»¼°j¡G%d\n", sumTail(s, 0));
        System.out.printf("°j°é¡G%d\n", sumLoop(s, 0));
    }
    
    public static int sumTail(String str, int r) {
        if (str.equals("")) {
            return r;
        } else  {
            return  sumTail(str.substring(1), r + Integer.parseInt(str.substring(0, 1)));
        }
    }
    
    public static int sumLoop(String str, int r) {
        while (!str.equals("")) {
            r = r + Integer.parseInt(str.substring(0, 1));
            str = str.substring(1);
        }
        return r;
    }
}
