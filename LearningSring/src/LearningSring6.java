public class LearningSring6 {
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder(); // StringBuilder字串建造。
		for(int i=1;i<100;i++){
			builder.append(i).append('+');
		}
		System.out.println(builder.append(100).toString()); // toString() 轉換成字串。
	}
}
// 只產生一個StringBuilder物件，也只進行一次的輸出。