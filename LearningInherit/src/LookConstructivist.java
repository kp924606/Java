class Some{
	Some(){
		System.out.println("©I¥sSome()");
	}	
	Some(int i){
		System.out.println("©I¥sSome(int i)");
	}	
}
class Other extends Some{
	Other(){
		System.out.println("©I¥sOther()");
	}		
}	
public class LookConstructivist {	
	public static void main(String[] args) {
		Other other=new Other();	// ¥ý©I¥s	Some¦A©I¥sOther¡C
	}
}
