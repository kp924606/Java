// �ĤT��:308-�q���g��O���`�p
import java.util.Scanner;
public class JPD308 {
    static Scanner keyboard = new Scanner(System.in);
    static int i = -1;
    public static void main(String[] args) {
        int total = 0, s = 0;
        do {
            System.out.print("�п�J���O���B�A�ο�J-1�����G");
            s = keyboard.nextInt();
            if(s != i) total = total + s;
        } while (s != i);
        System.out.println("�q���P���`���O�G"+ total);
    }
}
