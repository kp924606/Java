package JP05;
import java.util.Scanner;
public class JPA05 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.print("�п�J�ǥͤH�ơG");
        int num = keyboard.nextInt();
        float[] score = new float[num];
        
        float sum = 0.0f;
        
        for (int i = 0; i < score.length; i++) {
            System.out.print("��" + (i + 1) + "�Ӿǥͪ����Z�G");
            score[i] = keyboard.nextFloat();
            sum += score[i];
        }
       
        System.out.println("�H�ơG" + num + "\n�`���G" + sum + "\n�����G" + (sum / num));
    }
}
