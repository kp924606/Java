package Map;
import java.util.*;
public class MapKeyValue {
	public static void foreach (Iterable<String>iterable){
		for(String element:iterable){
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		Map<String,String>map=new HashMap<>();
		map.put("one","�@");
		map.put("two","�G");
		map.put("three","�T");
		System.out.println("�����");
		foreach(map.keySet());
		System.out.println("��ܭ�");
		foreach(map.values());
	}
}
