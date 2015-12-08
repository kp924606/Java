package oceanWorld1Human;
import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;
public class oceanWorld1Human implements Swimmer{
	private String name;
	public oceanWorld1Human(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void swim() {
		System.out.printf("¤HÃþ¡G%s ´åªa%n",name);
	}
}
