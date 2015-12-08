package Map;
import java.util.*;
class StringCompsrstor implements Comparator<String>{
	public int compare(String s1, String s2) {		
		return -s1.compareTo(s2);
	}	
}
public class Messages3 {
	public static void main(String[] args) {
		Map<String, String> messages=new TreeMap<>(new StringCompsrstor());
		messages.put("Hero", "Hello!!");
		messages.put("Albert", "Smart!!");
		messages.put("DaVinci", "Beautiful!!");
		System.out.println(messages); // 自動倒順序排列，顯示。	
	}
}
