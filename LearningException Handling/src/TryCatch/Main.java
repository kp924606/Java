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
			ex.printStackTrace(); // printStackTrace 堆疊追蹤。
		}
	}
}
// 善用堆疊追蹤，前提是程式碼中不可以有私吞例外的行為(try{}裡面一定要有實作)，否則會對程式碼維護造成嚴重傷害。