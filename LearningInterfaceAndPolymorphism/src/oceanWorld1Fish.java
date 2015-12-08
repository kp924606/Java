import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;
public abstract class oceanWorld1Fish implements Swimmer {
	protected String name;
	public oceanWorld1Fish(String name){
		this.name=name;
	}
	public String getName(){
		return name;		
	}
	public abstract void swim();	
	public static void main(String[] args) {		
	}
}
