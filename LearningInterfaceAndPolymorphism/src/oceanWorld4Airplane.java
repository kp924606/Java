
public class oceanWorld4Airplane implements oceanWorld3Flayer {
	protected String name;	
	public void fly() {
		System.out.printf("飛機 %s 在飛%n",name);
	}
	public oceanWorld4Airplane (){
		this.name=name;
	}
}
