package Map;
import java.util.*;
public class Messages {
	public static void main(String[] args) {
		Map<String,String>messages=new HashMap<>();
		messages.put("Hero", "Hello!!");
		messages.put("Albert", "Smart!!");
		messages.put("DaVinci", "Beautiful!!");	
		Scanner scanner=new Scanner(System.in);
		System.out.print("�����֪��T���G");
		String message=messages.get(scanner.nextLine());
		System.out.println(message);
		System.out.println(messages);
	}
}
