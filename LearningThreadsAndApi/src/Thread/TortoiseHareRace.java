package Thread;
public class TortoiseHareRace {
	public static void main(String[] args) throws InterruptedException{ // InterruptedException 中斷異常。
		boolean[] flags={true,false};
		int totalStep=10;
		int tortoiseStep=0;
		int hareStep=0;
		System.out.println("龜兔賽跑開始...");
		while(tortoiseStep<totalStep && hareStep<totalStep){ // 跑的次數。
			Thread.sleep(1000); // 暫停1000ms。
			tortoiseStep++;	// 烏龜走一步。
			System.out.printf("烏龜跑了 %d 步...%n",tortoiseStep);
			boolean isHareSleep=flags[((int)(Math.random()*10))%2]; // 取得布林值表示，隨機睡覺。
			if(isHareSleep){ // 野兔睡覺。
				System.out.println("兔子睡著了zzzz%n");
			}
			else{
				hareStep+=2; // 野兔走兩步。
				System.out.printf("兔子跑了 %d 步...%n",hareStep);
			}
		}
		if(tortoiseStep>hareStep){ // 烏龜步數大於兔子步數。
			System.out.println("烏龜贏了!!...");
		}
		else{
			System.out.println("兔子贏了!!...");
		}
	}
}
