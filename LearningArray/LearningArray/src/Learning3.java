public class Learning3 {
	public static void main(String[] args) {
		int [][]cords1=new int[][]{{1,2,3},{4,5,6}};
		int [][]cords2=cords1;
		cords2[1][1]=7;   // scores1�ѦҪ�����]��scores2�ѦҡC
		for(int [] row:cords1){  // ��ơC
			for(int value:row){  // �C�ơC
				System.out.printf("%2d",value);
			}
			System.out.println(); // ���cords1�C
		}
		System.out.println("-------------");
		for(int x=0;x<cords1.length;x++){ 		// ��ơC
			for(int y=0;y<cords1[x].length;y++){ // �C�ơC
				System.out.printf("%2d",cords1[x][y]);
			}
			System.out.println(); // ���cords2�C
		}
	}
}
