public abstract class InheritanceGuessGame {	
	public void go(){
		int number=(int)(Math.random()*10);
		int guess;
		do{
			print("�п�J�Ʀr�G");
			guess=nextInt();
		}while(guess!=number);
		println("�q���F!");
	}
	public abstract void print(String text);
	public abstract void println(String text);
	public abstract int nextInt();
	public static void main(String[] args) {	
	}
}
