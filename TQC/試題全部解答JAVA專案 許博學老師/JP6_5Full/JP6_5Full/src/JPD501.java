// �Ĥ���:501-�}�C�p��
import java.util.Scanner;
public class JPD501 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String args[]) {
        System.out.println("�п�J10�Ӿ�ơG");
        int[] data = new int[10];
        int sum = 0, n = 0;
        
        for (int i = 0; i < data.length; i++) {
            System.out.print("��" + (i + 1) + "�Ӿ�ơG");
            data[i] = keyboard.nextInt();
            if (data[i] > 60) {
                sum += data[i];
                n++;
            }
        }
        
        System.out.println("�}�C���j��60����" + n + "��\n�`�X��" + sum + "\n�����Ȭ�" + (sum / (double)n));
    }
}
