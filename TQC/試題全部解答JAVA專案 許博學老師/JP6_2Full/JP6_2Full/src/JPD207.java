// �ĤG��:207-�T��������P�_
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
        System.out.print("�п�J�T�Ӿ�ơG");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        a2 = a * a;
        b2 = b * b;
        c2 = c * c;
        
        if (a + b > c && b + c > a && c + a > b) {
            if (a2 + b2 == c2 || b2 + c2 == a2 || c2 + a2 == b2) {
                System.out.printf("�����T����\n");
            } else if (a2 + b2 < c2 || b2 + c2 < a2 || c2 + a2 < b2) {
                System.out.printf("�w���T����\n");
            } else {
                System.out.printf("�U���T����\n");
            }
        } else {
            System.out.printf("���i�H�c���T����\n");
        }
*/
    	
        int a, b, c, t;
        System.out.print("�п�J�T�Ӿ�ơG");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        
        if(a > c) {t=a; a=c; c=t;}
        if(b > c) {t=b; b=c; c=t;}
        
        if (a + b > c ) {
            if (a*a + b*b == c*c) {
                System.out.printf("�����T����\n");
            } else if (a*a + b*b < c*c) {
                System.out.printf("�w���T����\n");
            } else {
                System.out.printf("�U���T����\n");
            }
        } else {
            System.out.printf("���i�H�c���T����\n");
        }
    }
}
