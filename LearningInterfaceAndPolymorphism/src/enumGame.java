
public class enumGame {
	public static void play(enumAction action){
		switch (action) {
		case STOP:			
			System.out.println("播放停止動畫");
			break;
		case LEFT:
			System.out.println("播放向左動畫");
			break;
		case RIGHT:			
			System.out.println("播放向右動畫");
			break;
		case UP:
			System.out.println("播放向上動畫");
			break;
		case DOWN:
			System.out.println("播放向下動畫");
			break;
		default:
			System.out.println("不支援此動作");
			assert false:"非定義的常數";
			break;
		}
	}
	public static void main(String[] args) {
		play(enumAction.RIGHT); // 1。
		play(enumAction.UP);	// 3。		
	}

}
