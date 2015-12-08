package Thread;
public class Hare implements Runnable{
	private boolean[] flags={true,false};
	private int totalStep; // 跑的次數。
	private int step;
	public Hare(int totalStep){
		this.totalStep=totalStep;
	}
	public void run() {
		try {
			while(step<totalStep){
				Thread.sleep(1000);
				boolean isHareSleep=flags[((int)(Math.random()*10))%2]; // 取得布林值表示，隨機睡覺。
				if(isHareSleep){ // 野兔睡覺。
					System.out.println("兔子睡著了zzzz%n");
				}
				else{
					step+=2; // 野兔走兩步。
					System.out.printf("兔子跑了 %d 步...%n",step);
				}
			}
		} catch (InterruptedException e) { // 中斷異常。
			throw new RuntimeException(e); // 運行時異常。
		}	
	}
}
