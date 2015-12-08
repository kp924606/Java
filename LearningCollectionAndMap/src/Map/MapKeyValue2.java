package Map;
import java.util.*;
public class MapKeyValue2 {
	public static void foreach (Iterable<Map.Entry<String, String>>iterable){
		for(Map.Entry<String, String> entry:iterable){
			System.out.printf("(¡‰ %s ,≠» %s)%n",entry.getKey(),entry.getValue());
		}
	}
	public static void main(String[] args) {
		Map<String,String>map=new TreeMap<>();		
		map.put("one","§@");
		map.put("two","§G");
		map.put("three","§T");
		foreach(map.entrySet());
	}
}
