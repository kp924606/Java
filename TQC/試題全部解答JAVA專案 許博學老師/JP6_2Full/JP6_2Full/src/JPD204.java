// 第二類:204-公倍數計算
import java.util.*;
class JPD204 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
  
    public static void test() {
        System.out.println("Input:");
        int k = input.nextInt();
        
        if(k % 5 == 0 && k% 9 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}

