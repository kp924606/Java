
public class enumGame {
	public static void play(enumAction action){
		switch (action) {
		case STOP:			
			System.out.println("���񰱤�ʵe");
			break;
		case LEFT:
			System.out.println("����V���ʵe");
			break;
		case RIGHT:			
			System.out.println("����V�k�ʵe");
			break;
		case UP:
			System.out.println("����V�W�ʵe");
			break;
		case DOWN:
			System.out.println("����V�U�ʵe");
			break;
		default:
			System.out.println("���䴩���ʧ@");
			assert false:"�D�w�q���`��";
			break;
		}
	}
	public static void main(String[] args) {
		play(enumAction.RIGHT); // 1�C
		play(enumAction.UP);	// 3�C		
	}

}
