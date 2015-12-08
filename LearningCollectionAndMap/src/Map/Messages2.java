package Map;
import java.util.*;
public class Messages2 {
	public static void main(String[] args) {
		Map<String, String> messages=new TreeMap<>();
		messages.put("Hero", "Hello!!");
		messages.put("Albert", "Smart!!");
		messages.put("DaVinci", "Beautiful!!");
		System.out.println(messages); // 自動順序排列，顯示。		
	}
}
