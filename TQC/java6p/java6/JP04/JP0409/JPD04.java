import java.util.Scanner;
public class JPD04 {
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
    
    ...
}