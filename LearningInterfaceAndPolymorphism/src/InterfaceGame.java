
public class InterfaceGame {
	public static void play(int action){
		switch (action) {
		case InterfaceAction.STOP:	 // public static final int STOP=0;�C
			System.out.println("���񰱤�ʵe");
			break;
		case InterfaceAction.RIGHT:
			System.out.println("����V�k�ʵe");
			break;
		case InterfaceAction.LEFT:
			System.out.println("����V���ʵe");
			break;
		case InterfaceAction.UP: // public static final int UP=3;�C
			System.out.println("����V�W�ʵe");
			break;
		case InterfaceAction.DOWN:
			System.out.println("����V�U�ʵe");
			break;
		default:
			System.out.println("���䴩���ʧ@");
			break;
		}		
	}	
	public static void main(String[] args) {
		play(InterfaceAction.STOP);
		play(InterfaceAction.UP);		
		play(InterfaceAction.Interface); // int Interface=5;�C
	}
}
