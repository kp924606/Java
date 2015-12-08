import java.util.Scanner;
public class InheritanceConsoleGame extends InheritanceGuessGame{
	public Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {		
	}	
	public void print(String text) {		
		System.out.print(text);
	}	
	public void println(String text) {
		System.out.println(text);
	}	
	public int nextInt() {		
		return scanner.nextInt();
	}
}