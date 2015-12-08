import java.util.Arrays;

public class Learning6 {
	public static void main(String[] args) {
		int []scores1={88,81,74,68,78,76,77,85,95,93};
		int []scores2=Arrays.copyOf(scores1, scores1.length); // 複製陣列scores1的資料，有scores1的陣列數個資料，到scores2。
		System.out.print("scores1:"); 	// 顯示 scores1。
		for(int scores:scores1){
			System.out.print(scores+" ");
		}
		scores2[0]=99;
		System.out.print("\nscores2:"); 	// 顯示 scores2。
		for(int scores:scores2){
			System.out.print(scores+" ");
		}
	}
}
