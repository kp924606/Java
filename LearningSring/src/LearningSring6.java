public class LearningSring6 {
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder(); // StringBuilder�r��سy�C
		for(int i=1;i<100;i++){
			builder.append(i).append('+');
		}
		System.out.println(builder.append(100).toString()); // toString() �ഫ���r��C
	}
}
// �u���ͤ@��StringBuilder����A�]�u�i��@������X�C