import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;

public class oceanWorld4Seapplane extends oceanWorld4Airplane implements Swimmer {
	public oceanWorld4Seapplane(String name){
		super();
	}	
	public void fly() {
		System.out.print("���W%n");
		super.fly();
	}	
	public void swim() {
		System.out.printf("���W���� %s ������%n",name);		
	}	
}
