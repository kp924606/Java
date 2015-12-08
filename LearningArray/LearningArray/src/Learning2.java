public class Learning2 {
	public static void main(String[] args) {
		int [][] cords=new int[2][3];
		   // 第一種顯示方法。
		for(int x=0;x<cords.length;x++){ 		// 行數。
			for(int y=0;y<cords[x].length;y++){ // 列數。
				System.out.printf("%2d",cords[x][y]);
			}
			System.out.println();
		}
		System.out.println("-------------");
		   // 第二種顯示方法。
		for(int [] row:cords){  // 行數。
			for(int value:row){ // 列數。
				System.out.printf("%2d",value);
			}
			System.out.println();
		}
	}
}
