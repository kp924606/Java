
public class InterfaceGame {
	public static void play(int action){
		switch (action) {
		case InterfaceAction.STOP:	 // public static final int STOP=0;。
			System.out.println("播放停止動畫");
			break;
		case InterfaceAction.RIGHT:
			System.out.println("播放向右動畫");
			break;
		case InterfaceAction.LEFT:
			System.out.println("播放向左動畫");
			break;
		case InterfaceAction.UP: // public static final int UP=3;。
			System.out.println("播放向上動畫");
			break;
		case InterfaceAction.DOWN:
			System.out.println("播放向下動畫");
			break;
		default:
			System.out.println("不支援此動作");
			break;
		}		
	}	
	public static void main(String[] args) {
		play(InterfaceAction.STOP);
		play(InterfaceAction.UP);		
		play(InterfaceAction.Interface); // int Interface=5;。
	}
}
