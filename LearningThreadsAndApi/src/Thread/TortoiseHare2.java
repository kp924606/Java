package Thread;
public class TortoiseHare2 {
	public static void main(String[] args) {
		Tortoise tortoise=new Tortoise(10); // �Q�t���]�����ơC
		Hare hare=new Hare(10); // �ߤl���]�����ơC
		Thread tortThread=new Thread(tortoise);
		Thread hareThread=new Thread(hare);
		tortThread.start();
		hareThread.start();
	}
}
