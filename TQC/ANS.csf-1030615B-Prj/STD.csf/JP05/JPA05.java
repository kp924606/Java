package JP05;

public class JPA05 {
	public static void main(String[] argv) {
        int[] data = new int[10];
        
        data[0] = 0;
        data[1] = 1;
        
        for (int i = 2; i < data.length; i++) {
                data[i] = data[i-1] + data[i-2];
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
