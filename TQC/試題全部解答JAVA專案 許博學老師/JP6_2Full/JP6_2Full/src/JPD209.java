// �ĤG��:209-�H���y��
import java.util.*;
public class JPD209 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    public static void test() {
        System.out.print("�п�Jx�y�СG");
        double x = keyboard.nextDouble();
        System.out.print("�п�Jy�y�СG");
        double y = keyboard.nextDouble();
        
        if (x == 0.0 && y == 0.0) System.out.printf("(%.2f,%.2f)�����I\n", x, y);
        else if (x == 0.0 && y != 0.0) System.out.printf("(%.2f,%.2f)�by�b�W\n", x, y);
        else if (x != 0.0 && y == 0.0) System.out.printf("(%.2f,%.2f)�bx�b�W\n", x, y);
        else if(x > 0.0 && y > 0.0) System.out.printf("(%.2f,%.2f)�b�Ĥ@�H��\n", x, y);
        else if(x < 0.0 && y > 0.0) System.out.printf("(%.2f,%.2f)�b�ĤG�H��\n", x, y);
        else if(x < 0.0 && y < 0.0) System.out.printf("(%.2f,%.2f)�b�ĤT�H��\n", x, y);
        else System.out.printf("(%.2f,%.2f)�b�ĥ|�H��\n", x, y);
    }
}
