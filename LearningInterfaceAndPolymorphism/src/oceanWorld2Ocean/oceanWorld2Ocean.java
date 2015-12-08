package oceanWorld2Ocean;
import oceanWorld1Submarine.oceanWorld1Submarine;
import oceanWorld1Swimmer.oceanWorld1Swimmer.Swimmer;
import oceanWorld1Human.oceanWorld1Human;
public class oceanWorld2Ocean {
	public static void doSwim(Swimmer swimmer){
		swimmer.swim();
	}
	public static void main(String[] args) {
		doSwim(new oceanWorld1Human("HerO"));
		doSwim(new oceanWorld1Submarine("¯èªÅ¥ÀÄ¥"));
	}
}
