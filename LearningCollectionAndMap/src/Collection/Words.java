package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Words {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("請輸入英文：");
		String line=scanner.nextLine();
		String[] tokens=line.split(" ");
		Set words=new HashSet();
		for(String token:tokens){
			words.add(token);			
		}
		System.out.printf("不重複的單字有 %d 個:%s %n", words.size(),words);
	}

}
// This is a dog that is acat where is the student。