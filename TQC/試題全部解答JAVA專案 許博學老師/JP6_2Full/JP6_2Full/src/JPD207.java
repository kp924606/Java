// 第二類:207-三角形邊長判斷
import java.util.*;
public class JPD207 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    static void test() {
/*
        int a, b, c;
        int a2, b2, c2;
        System.out.print("請輸入三個整數：");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        a2 = a * a;
        b2 = b * b;
        c2 = c * c;
        
        if (a + b > c && b + c > a && c + a > b) {
            if (a2 + b2 == c2 || b2 + c2 == a2 || c2 + a2 == b2) {
                System.out.printf("直角三角形\n");
            } else if (a2 + b2 < c2 || b2 + c2 < a2 || c2 + a2 < b2) {
                System.out.printf("鈍角三角形\n");
            } else {
                System.out.printf("銳角三角形\n");
            }
        } else {
            System.out.printf("不可以構成三角形\n");
        }
*/
    	
        int a, b, c, t;
        System.out.print("請輸入三個整數：");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        
        if(a > c) {t=a; a=c; c=t;}
        if(b > c) {t=b; b=c; c=t;}
        
        if (a + b > c ) {
            if (a*a + b*b == c*c) {
                System.out.printf("直角三角形\n");
            } else if (a*a + b*b < c*c) {
                System.out.printf("鈍角三角形\n");
            } else {
                System.out.printf("銳角三角形\n");
            }
        } else {
            System.out.printf("不可以構成三角形\n");
        }
    }
}
