package Thread;
public class TortoiseHareRace {
	public static void main(String[] args) throws InterruptedException{ // InterruptedException ���_���`�C
		boolean[] flags={true,false};
		int totalStep=10;
		int tortoiseStep=0;
		int hareStep=0;
		System.out.println("�t���ɶ]�}�l...");
		while(tortoiseStep<totalStep && hareStep<totalStep){ // �]�����ơC
			Thread.sleep(1000); // �Ȱ�1000ms�C
			tortoiseStep++;	// �Q�t���@�B�C
			System.out.printf("�Q�t�]�F %d �B...%n",tortoiseStep);
			boolean isHareSleep=flags[((int)(Math.random()*10))%2]; // ���o���L�Ȫ�ܡA�H����ı�C
			if(isHareSleep){ // ���ߺ�ı�C
				System.out.println("�ߤl�εۤFzzzz%n");
			}
			else{
				hareStep+=2; // ���ߨ���B�C
				System.out.printf("�ߤl�]�F %d �B...%n",hareStep);
			}
		}
		if(tortoiseStep>hareStep){ // �Q�t�B�Ƥj��ߤl�B�ơC
			System.out.println("�Q�tĹ�F!!...");
		}
		else{
			System.out.println("�ߤlĹ�F!!...");
		}
	}
}
