
public class Learning4 {

	public static void main(String[] args) {
		int [][]cords1=new int[2][];
		cords1[0]=new int[]{1,2,3,4,5};  // 行數。
		cords1[1]=new int[]{1,2,3};		 // 列數。		
		for(int [] row:cords1){ 		 // 行數。
			for(int value:row){  	     // 列數。
				System.out.printf("%2d",value);
			}
			System.out.println(); // 顯示cords1。
		}

	}

}
