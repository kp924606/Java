package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Words {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("�п�J�^��G");
		String line=scanner.nextLine();
		String[] tokens=line.split(" ");
		Set words=new HashSet();
		for(String token:tokens){
			words.add(token);			
		}
		System.out.printf("�����ƪ���r�� %d ��:%s %n", words.size(),words);
	}

}
// This is a dog that is acat where is the student�C