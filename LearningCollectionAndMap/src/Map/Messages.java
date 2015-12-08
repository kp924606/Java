package Map;
import java.util.*;
public class Messages {
	public static void main(String[] args) {
		Map<String,String>messages=new HashMap<>();
		messages.put("Hero", "Hello!!");
		messages.put("Albert", "Smart!!");
		messages.put("DaVinci", "Beautiful!!");	
		Scanner scanner=new Scanner(System.in);
		System.out.print("取的誰的訊息：");
		String message=messages.get(scanner.nextLine());
		System.out.println(message);
		System.out.println(messages);
	}
}
