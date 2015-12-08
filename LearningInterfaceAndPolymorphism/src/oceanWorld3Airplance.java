import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;
public class oceanWorld3Airplance implements Swimmer,oceanWorld3Flayer{
	private String name;
	public oceanWorld3Airplance(String name){
		this.name=name;
	}
	public void swim() {	
		System.out.printf("海上飛機  %s 在飛%n", name);
	}	
	public void fly() {
		System.out.printf("海上飛機  %s 航行海面%n", name);
	}
}
