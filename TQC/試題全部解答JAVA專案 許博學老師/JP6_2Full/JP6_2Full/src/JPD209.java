// 第二類:209-象限座標
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
        System.out.print("請輸入x座標：");
        double x = keyboard.nextDouble();
        System.out.print("請輸入y座標：");
        double y = keyboard.nextDouble();
        
        if (x == 0.0 && y == 0.0) System.out.printf("(%.2f,%.2f)為原點\n", x, y);
        else if (x == 0.0 && y != 0.0) System.out.printf("(%.2f,%.2f)在y軸上\n", x, y);
        else if (x != 0.0 && y == 0.0) System.out.printf("(%.2f,%.2f)在x軸上\n", x, y);
        else if(x > 0.0 && y > 0.0) System.out.printf("(%.2f,%.2f)在第一象限\n", x, y);
        else if(x < 0.0 && y > 0.0) System.out.printf("(%.2f,%.2f)在第二象限\n", x, y);
        else if(x < 0.0 && y < 0.0) System.out.printf("(%.2f,%.2f)在第三象限\n", x, y);
        else System.out.printf("(%.2f,%.2f)在第四象限\n", x, y);
    }
}
