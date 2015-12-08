// 第一類:104-距離計算
import java.util.Scanner;


public class JPD104 {
    public static void main(String[] args){
    	Scanner keyin = new Scanner(System.in);
    	int x1,y1,x2,y2;
    	System.out.print("輸入第1組的 x 和 y 座標：");
    	x1 = keyin.nextInt();
    	y1 = keyin.nextInt();
    	System.out.print("輸入第2組的 x 和 y 座標：");
    	x2 = keyin.nextInt();
    	y2 = keyin.nextInt();
    	System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f。"
    			,x1*1.0, y1*1.0, x2*1.0, y2*1.0, 
    			Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,  2)));
    }
}
