// 第一類:105-存錢筒
import java.util.Scanner;


public class JPD105 {
    public static void main(String[] args){
    	Scanner keyin = new Scanner(System.in);
    	int x1,x5,x10,x50;
    	String name;
    	System.out.print("請輸入小孩姓名：");
    	name = keyin.nextLine();
    	System.out.println("Hi, " + name + ",請輸入你的銅板的個數：");
    	
    	System.out.print("請輸入1元的數量：");
    	x1 = keyin.nextInt();
    	System.out.print("請輸入5元的數量：");
    	x5 = keyin.nextInt();
    	System.out.print("請輸入10元的數量：");
    	x10 = keyin.nextInt();
    	System.out.print("請輸入50元的數量：");
    	x50 = keyin.nextInt();
//    	System.out.println("您的錢總共有：" + (x1+x5*5+x10*10+x50*50) + "元");
    	
    	int s = x1+x5*5+x10*10+x50*50;
//    	System.out.println("您的錢總共有：" + s/1000 + " 千  " + 
//    	  s%1000/100 + " 百  " + s%1000%100/10 + " 十  " + s%10 + " 元");

    	System.out.println("您的錢總共有：" + s/1000 + " 千  " + 
    	    	  s%1000/100 + " 百  " + s%100/10 + " 十  " + s%10 + " 元");
}
}
