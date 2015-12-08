
public class Learning1 {
	public static void main(String[] args) {
		int[] scores1=new int[]{88,81,74,68,78,76,77,85,95,93};
		int[] scores2=scores1; // scores1參考的物件也給scores2參考。
		scores2[0]=99;
		System.out.println("scores1="+scores1[0]);
		System.out.println("scores2="+scores2[0]);
	}
}
