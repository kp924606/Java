import java.util.Arrays;

public class Learning6 {
	public static void main(String[] args) {
		int []scores1={88,81,74,68,78,76,77,85,95,93};
		int []scores2=Arrays.copyOf(scores1, scores1.length); // �ƻs�}�Cscores1����ơA��scores1���}�C�ƭӸ�ơA��scores2�C
		System.out.print("scores1:"); 	// ��� scores1�C
		for(int scores:scores1){
			System.out.print(scores+" ");
		}
		scores2[0]=99;
		System.out.print("\nscores2:"); 	// ��� scores2�C
		for(int scores:scores2){
			System.out.print(scores+" ");
		}
	}
}
