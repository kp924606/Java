import oceanWorld1Human.oceanWorld1Human;
import oceanWorld1Submarine.oceanWorld1Submarine;
import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;
public class oceanWorld3Ocean {
	public static void doSwim(Swimmer swimmer){
		swimmer.swim();
	}
	public static void main(String[] args) {	
		doSwim(new oceanWorld1Human("HerO"));
		doSwim(new oceanWorld1Submarine("¯èªÅ¥ÀÄ¥"));
		doSwim(new oceanWorld3Airplance("´ç¾~"));
		doSwim(new oceanWorld3FlayingFish("­¸³½"));
	}
}
