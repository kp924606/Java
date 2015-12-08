package oceanWorld1Submarine;
import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;
public class oceanWorld1Submarine implements Swimmer{
	private String name;
	public oceanWorld1Submarine(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void swim() {		
		System.out.printf("¼ç¤ô¸¥¡G%s ´åªa%n",name);
	}
}
