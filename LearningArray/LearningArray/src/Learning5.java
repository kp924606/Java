public class Learning5 {
	public static void main(String[] args) {
		int [][]arr={{1,2,3,4,5},{1,2,3}};
		for(int [] row:arr){ 		// 行數。
			for(int value:row){ 	// 列數。
				System.out.print(value+" "); // 數字間有間格。
			}
			System.out.println(); // 換行。
		}

	}

}
