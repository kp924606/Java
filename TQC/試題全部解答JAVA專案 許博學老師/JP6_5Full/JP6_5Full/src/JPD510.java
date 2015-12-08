// 第五類:510-二分搜尋法
import java.util.Scanner;
public class JPD510 {
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] argv) {
        search();
        search();
    }
    
    public static void search() {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; // 已排序資料

        System.out.print("請輸入要找尋的資料：");

        int target = keyboard.nextInt();
    
        int high = data.length - 1; // 範圍區間右邊位置
        int low = 0; // 範圍區間左邊位置
        int middle = 0;
        int times = 0; // 搜尋次數

        while (low <= high) { // 還沒找完
            times++; // 累計次數
            middle = (low + high) / 2; // 找出中間值
    
            System.out.println("尋找區間：" + low + "(" + data[low] + ").." + high + "(" + data[high] + "),中間：" + middle + "(" + data[middle] + ")");
    
            if (target == data[middle]) // 找到了
                break;
            else if (target < data[middle]) // 在左半邊
                high = middle - 1;
            else // 在右半邊
                low = middle + 1;
        }

        System.out.println("經過 " + times + " 次的尋找");

        if (target == data[middle]) {
            System.out.println("您要找的資料在陣列中的第" +
            middle + "個位置");
        }
        else
            System.out.println(target + "不在陣列中");
    }
}
