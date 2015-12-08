// 第三類:308-電腦週邊費用總計
import java.util.Scanner;
public class JPD308 {
    static Scanner keyboard = new Scanner(System.in);
    static int i = -1;
    public static void main(String[] args) {
        int total = 0, s = 0;
        do {
            System.out.print("請輸入消費金額，或輸入-1結束：");
            s = keyboard.nextInt();
            if(s != i) total = total + s;
        } while (s != i);
        System.out.println("電腦周邊總消費："+ total);
    }
}
