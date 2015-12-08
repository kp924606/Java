public class Learning3 {
	public static void main(String[] args) {
		int [][]cords1=new int[][]{{1,2,3},{4,5,6}};
		int [][]cords2=cords1;
		cords2[1][1]=7;   // scores1把σン倒scores2把σ
		for(int [] row:cords1){  // ︽计
			for(int value:row){  // 计
				System.out.printf("%2d",value);
			}
			System.out.println(); // 陪ボcords1
		}
		System.out.println("-------------");
		for(int x=0;x<cords1.length;x++){ 		// ︽计
			for(int y=0;y<cords1[x].length;y++){ // 计
				System.out.printf("%2d",cords1[x][y]);
			}
			System.out.println(); // 陪ボcords2
		}
	}
}
