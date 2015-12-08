// 第三類:301-整數連加
import java.util.*;
class JPD301 {
    public static void main(String argv[]) {
        int i, n, s=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input:");
        n = input.nextInt();
        for (i=1;i<=n;i++) {
            s = s+ i;;                       
        }
        System.out.println("1 + ... + " + n + " = " + s);
    }
}