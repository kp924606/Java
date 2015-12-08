// �Ĥ���:510-�G���j�M�k
import java.util.Scanner;
public class JPD510 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] argv) {
        search();
        search();
    }
    
    public static void search() {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; // �w�ƧǸ��

        System.out.print("�п�J�n��M����ơG");

        int target = keyboard.nextInt();
    
        int high = data.length - 1; // �d��϶��k���m
        int low = 0; // �d��϶������m
        int middle = 0;
        int times = 0; // �j�M����

        while (low <= high) { // �٨S�䧹
            times++; // �֭p����
            middle = (low + high) / 2; // ��X������
    
            System.out.println("�M��϶��G" + low + "(" + data[low] + ").." + high + "(" + data[high] + "),�����G" + middle + "(" + data[middle] + ")");
    
            if (target == data[middle]) // ���F
                break;
            else if (target < data[middle]) // �b���b��
                high = middle - 1;
            else // �b�k�b��
                low = middle + 1;
        }

        System.out.println("�g�L " + times + " �����M��");

        if (target == data[middle]) {
            System.out.println("�z�n�䪺��Ʀb�}�C������" +
            middle + "�Ӧ�m");
        }
        else
            System.out.println(target + "���b�}�C��");
    }
}
