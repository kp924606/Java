public class Magician extends Role{ // 魔術師。
	public void fight(){
		System.out.println("魔法攻擊");
	}
	public void cure(){
		System.out.println("魔法治療");	
	}	
	public String toString(){		
		return " 魔術師 "+super.toString();
	}
	public static void main(String[] args) {		
	}
}
