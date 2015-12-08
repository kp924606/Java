
public class oceanWorld4Submarine extends oceanWorld4Boat implements oceanWorld4Diver{
	public oceanWorld4Submarine(String name) {
		super(name);		
	}	
	public void dive() {
		System.out.printf("¼ç¤ô¸¥ %s ¼ç¦æ",name);		
	}

}
