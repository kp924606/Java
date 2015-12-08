// 第三類:302-巢狀迴圈
import java.util.Scanner;
public class JPD302 {
    public static void main(String[] args) {
        int i = 1, j = 1, count = 0;
        for (i = 1; i <= 3; i++) {        //第一個迴圈，i從1到3
            for(j=1;j<=9;j++) {
            	count++;
            }
        }
        System.out.printf("count = %d\n", count);
    }
}