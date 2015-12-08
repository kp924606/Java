class Some{
		void someMethod(int i){
			System.out.println("int ª©¥»©I¥s...");
		}
		void someMethod(Integer integer){
			System.out.println("integer ª©¥»©I¥s...");
		}
}
public class OverLoadBoxIng {	
	public static void main(String[] args) {
		Some s=new Some();
		s.someMethod(1);
		s.someMethod(new Integer(1));
	}	
}
