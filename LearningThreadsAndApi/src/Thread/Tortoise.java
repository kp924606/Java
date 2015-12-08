package Thread;
public class Tortoise implements Runnable{
	private int totalStep; // �]�����ơC
	private int step;
	public Tortoise(int totalStep){
		this.totalStep=totalStep;
	}
	public void run() {
		try {
			while(step<totalStep){
				Thread.sleep(1000);
				step++;
				System.out.printf("�Q�t�]�F %d �B...%n",step);
			}
		} catch (InterruptedException e) { // ���_���`�C
			throw new RuntimeException(e); // �B��ɲ��`�C
		}		
	}		
}
