public class Learning2 {
	public static void main(String[] args) {
		int [][] cords=new int[2][3];
		   // �Ĥ@����ܤ�k�C
		for(int x=0;x<cords.length;x++){ 		// ��ơC
			for(int y=0;y<cords[x].length;y++){ // �C�ơC
				System.out.printf("%2d",cords[x][y]);
			}
			System.out.println();
		}
		System.out.println("-------------");
		   // �ĤG����ܤ�k�C
		for(int [] row:cords){  // ��ơC
			for(int value:row){ // �C�ơC
				System.out.printf("%2d",value);
			}
			System.out.println();
		}
	}
}
