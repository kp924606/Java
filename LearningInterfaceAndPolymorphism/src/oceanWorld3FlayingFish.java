
public class oceanWorld3FlayingFish extends oceanWorld1Fish implements oceanWorld3Flayer{	
	public oceanWorld3FlayingFish(String name) {
		super(name);		
	}
	public void swim() {
		System.out.println("飛魚游泳");		
	}	
	public void fly() {
		System.out.println("飛魚會飛");		
	}
}
