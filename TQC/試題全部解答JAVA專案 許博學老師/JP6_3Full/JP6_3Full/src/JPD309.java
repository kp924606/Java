// �ĤT��:309-�j�魿�ƧP�_
import java.io.*;
class JPD309 {
    public static void main(String argv[]) throws IOException {
        int inputNum;
        int sum=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        inputNum = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= inputNum; i++) {
            if (i % 7 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println("Answer: " + sum);
    }
}
