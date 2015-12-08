// 材摸:205-计耞
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
        		System.out.println(k + "琌236计");
        	} else {
        		System.out.println(k + "琌2计");
        	}
        	
        } else {
        	if(k % 3 == 0){
        		System.out.println(k + "琌3计");
        	} else {
        		System.out.println(k + "ぃ琌236计");
        	}
       }
/*
        if(k%2==0 && k%3==0 && k%7==0) System.out.println(k + "琌237计");
        else if (k%2==0 && k%3==0 && k%7!=0) System.out.println(k + "琌23计");
        else if (k%2==0 && k%3!=0 && k%7==0) System.out.println(k + "琌27计");
        else if (k%2==0 && k%3!=0 && k%7!=0) System.out.println(k + "琌2计");
        else if (k%2!=0 && k%3==0 && k%7==0) System.out.println(k + "琌37计");
        else if (k%2!=0 && k%3==0 && k%7!=0) System.out.println(k + "琌3计");
        else if (k%2!=0 && k%3!=0 && k%7==0) System.out.println(k + "琌7计");
        else System.out.println(k + "ぃ琌237计");
*/
    }
}
