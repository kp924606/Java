package Thread;
public class TortoiseHare2 {
	public static void main(String[] args) {
		Tortoise tortoise=new Tortoise(10); // 烏龜的跑的次數。
		Hare hare=new Hare(10); // 兔子的跑的次數。
		Thread tortThread=new Thread(tortoise);
		Thread hareThread=new Thread(hare);
		tortThread.start();
		hareThread.start();
	}
}
