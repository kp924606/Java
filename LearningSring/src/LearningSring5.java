
public class LearningSring5 {

	public static void main(String[] args) {
		for(int i=1;i<101;i++){
			System.out.print(i);
			if(i!=100){
				System.out.print('+');  // ���n�A�h�F�@�ӧP�_�A�h��@�Ǯɶ��C
			}
		}
		System.out.println();
		for(int i=1;i<100;i++){
			System.out.printf("%d+",i);  // ��W��²��A���I�s�{�\�h�����L�X�A��O����t�׬O�C�o�h�C			
		}
		System.out.print("100");
		System.out.println();
		String text="";
		for(int i=1;i<100;i++){
			text=text+i+'+';	 			// �T��ﵽ���֮į�A���W�c�����ͷs����C
		}
		System.out.println(text+100);
	}

}
