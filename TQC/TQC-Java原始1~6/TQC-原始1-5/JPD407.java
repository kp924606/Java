import java.util.Scanner;
public class JPD04 {
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
    
    
   ...

}