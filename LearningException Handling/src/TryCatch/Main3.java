package TryCatch;

public class Main3 {
	public static String a(){
		String text=null;
		return text.toUpperCase();	
	}
	public static void b(){
		a();		
	}
	public static void c(){
		try {
			b();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			Throwable t=ex.fillInStackTrace(); // 除新填裝例外堆疊，將起點設為重拋例外的地方，並回傳Throwable。
			throw (NullPointerException) t;		
		}
	}
	public static void main(String[] args){
		try {
			c();
		} catch (NullPointerException ex) {
			ex.printStackTrace(); // printStackTrace 堆疊追蹤。
		}
	}
}
