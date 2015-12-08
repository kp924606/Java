package Thread;
public class Tortoise implements Runnable{
	private int totalStep; // 跑的次數。
	private int step;
	public Tortoise(int totalStep){
		this.totalStep=totalStep;
	}
	public void run() {
		try {
			while(step<totalStep){
				Thread.sleep(1000);
				step++;
				System.out.printf("烏龜跑了 %d 步...%n",step);
			}
		} catch (InterruptedException e) { // 中斷異常。
			throw new RuntimeException(e); // 運行時異常。
		}		
	}		
}
