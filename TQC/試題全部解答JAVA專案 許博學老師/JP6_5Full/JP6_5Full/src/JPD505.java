// �Ĥ���:505-����}�C
public class JPD505 {
    public static void main(String[] argv) {
        String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.print("����}�C��Ƥ��e�G ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        
        reverse(data);
        
        System.out.print("����}�C��Ƥ���G ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void reverse(String[] data) {
        String tmp;
        for (int i = 0, j = data.length - 1; i < j; i++, j--) {
            tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }
}
