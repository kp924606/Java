// 第五類:509-選擇排序法
public class JPD509 {
    public static void main(String[] argv) {
        int[] data = {1, 3, 2, 5, 4, 6};
        
        sort(data);
    }
    
    public static void sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            // find minimun in i ~ data.length - 1
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            // swap data[i] with data[min]
            int tmp = data[i];
            data[i] = data[min];
            data[min] = tmp;
            
            for(int k:data)
                System.out.print(" " + k);
                
            System.out.println("");
        }
    }
}
