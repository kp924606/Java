import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;
public class oceanWorld4Boat implements Swimmer{
	protected String name;
	public oceanWorld4Boat(String name){
		this.name=name;
	}
	public void swim() {
		System.out.printf("��b���� %s ���",name);
	}
}
