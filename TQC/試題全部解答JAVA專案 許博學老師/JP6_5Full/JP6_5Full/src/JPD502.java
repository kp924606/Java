// 第五類:502-浮點數計算
import java.util.Scanner;
public class JPD502 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.print("請輸入學生人數：");
        int num = keyboard.nextInt();
        float[] score = new float[num];
        
        float sum = 0.0f;
        
        for (int i = 0; i < score.length; i++) {
            System.out.print("第" + (i + 1) + "個學生的成績：");
            score[i] = keyboard.nextFloat();
            sum += score[i];
        }
       
        System.out.println("人數：" + num + "\n總分：" + sum + "\n平均：" + (sum / num));
    }
}
