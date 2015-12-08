package Stream;
import java.io.*;
import java.util.Scanner;
public class Standardln {

	public static void main(String[] args) throws IOException{
		System.setIn(new FileInputStream(args[0]));
		try (Scanner scanner=new Scanner(System.in)){
			while(scanner.hasNextLine()){
				System.out.print(scanner.nextLine());
			}
		} 
	}
}
