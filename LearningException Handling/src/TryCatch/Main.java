package TryCatch;

public class Main {
	public static String a(){
		String text=null;
		return text.toUpperCase();	
	}
	public static void b(){
		a();		
	}
	public static void c(){
		b();
	}
	public static void main(String[] args){
		try {
			c();
		} catch (NullPointerException ex) {
			ex.printStackTrace(); // printStackTrace ���|�l�ܡC
		}
	}
}
// ���ΰ��|�l�ܡA�e���O�{���X�����i�H���p�]�ҥ~���欰(try{}�̭��@�w�n����@)�A�_�h�|��{���X���@�y���Y���ˮ`�C