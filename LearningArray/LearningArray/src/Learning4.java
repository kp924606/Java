
public class Learning4 {

	public static void main(String[] args) {
		int [][]cords1=new int[2][];
		cords1[0]=new int[]{1,2,3,4,5};  // ��ơC
		cords1[1]=new int[]{1,2,3};		 // �C�ơC		
		for(int [] row:cords1){ 		 // ��ơC
			for(int value:row){  	     // �C�ơC
				System.out.printf("%2d",value);
			}
			System.out.println(); // ���cords1�C
		}

	}

}
