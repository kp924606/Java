
public class Learning4 {

	public static void main(String[] args) {
		int [][]cords1=new int[2][];
		cords1[0]=new int[]{1,2,3,4,5};  // ︽计
		cords1[1]=new int[]{1,2,3};		 // 计		
		for(int [] row:cords1){ 		 // ︽计
			for(int value:row){  	     // 计
				System.out.printf("%2d",value);
			}
			System.out.println(); // 陪ボcords1
		}

	}

}
