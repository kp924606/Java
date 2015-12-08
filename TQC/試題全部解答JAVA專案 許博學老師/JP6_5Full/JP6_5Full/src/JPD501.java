// 第五類:501-陣列計算
import java.util.Scanner;
public class JPD501 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.println("請輸入10個整數：");
        int[] data = new int[10];
        int sum = 0, n = 0;
        
        for (int i = 0; i < data.length; i++) {
            System.out.print("第" + (i + 1) + "個整數：");
            data[i] = keyboard.nextInt();
            if (data[i] > 60) {
                sum += data[i];
                n++;
            }
        }
        
        System.out.println("陣列中大於60的有" + n + "個\n總合為" + sum + "\n平均值為" + (sum / (double)n));
    }
}
