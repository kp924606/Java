// �ĤG��:205-���ƧP�_
import java.util.*;
public class JPD205 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }
    
    static void test() {
        System.out.println("Enter an integer:");
        int k = input.nextInt();
        
        if(k % 2 == 0) {
        	if(k % 3 == 0){
        		System.out.println(k + "�O2�B3�B6������");
        	} else {
        		System.out.println(k + "�O2������");
        	}
        	
        } else {
        	if(k % 3 == 0){
        		System.out.println(k + "�O3������");
        	} else {
        		System.out.println(k + "���O2�B3�B6������");
        	}
       }
/*
        if(k%2==0 && k%3==0 && k%7==0) System.out.println(k + "�O2�B3�B7������");
        else if (k%2==0 && k%3==0 && k%7!=0) System.out.println(k + "�O2�B3������");
        else if (k%2==0 && k%3!=0 && k%7==0) System.out.println(k + "�O2�B7������");
        else if (k%2==0 && k%3!=0 && k%7!=0) System.out.println(k + "�O2������");
        else if (k%2!=0 && k%3==0 && k%7==0) System.out.println(k + "�O3�B7������");
        else if (k%2!=0 && k%3==0 && k%7!=0) System.out.println(k + "�O3������");
        else if (k%2!=0 && k%3!=0 && k%7==0) System.out.println(k + "�O7������");
        else System.out.println(k + "���O2�B3�B7������");
*/
    }
}
