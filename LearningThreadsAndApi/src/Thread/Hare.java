package Thread;
public class Hare implements Runnable{
	private boolean[] flags={true,false};
	private int totalStep; // �]�����ơC
	private int step;
	public Hare(int totalStep){
		this.totalStep=totalStep;
	}
	public void run() {
		try {
			while(step<totalStep){
				Thread.sleep(1000);
				boolean isHareSleep=flags[((int)(Math.random()*10))%2]; // ���o���L�Ȫ�ܡA�H����ı�C
				if(isHareSleep){ // ���ߺ�ı�C
					System.out.println("�ߤl�εۤFzzzz%n");
				}
				else{
					step+=2; // ���ߨ���B�C
					System.out.printf("�ߤl�]�F %d �B...%n",step);
				}
			}
		} catch (InterruptedException e) { // ���_���`�C
			throw new RuntimeException(e); // �B��ɲ��`�C
		}	
	}
}
