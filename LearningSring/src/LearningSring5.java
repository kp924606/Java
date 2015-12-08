
public class LearningSring5 {

	public static void main(String[] args) {
		for(int i=1;i<101;i++){
			System.out.print(i);
			if(i!=100){
				System.out.print('+');  // 不好，多了一個判斷，多花一些時間。
			}
		}
		System.out.println();
		for(int i=1;i<100;i++){
			System.out.printf("%d+",i);  // 比上面簡潔，但呼叫ㄌ許多次的印出，對記憶體速度是慢得多。			
		}
		System.out.print("100");
		System.out.println();
		String text="";
		for(int i=1;i<100;i++){
			text=text+i+'+';	 			// 確實改善不少效能，但頻繁的產生新物件。
		}
		System.out.println(text+100);
	}

}
