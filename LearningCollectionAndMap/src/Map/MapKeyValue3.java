package Map;
import java.util.*;
public class MapKeyValue3 {
	public static void main(String[] args) {
		Map<String,String>map=new TreeMap<>();		
		map.put("one","§@");
		map.put("two","§G");
		map.put("three","§T");
		Set entries=map.entrySet();
		for(Object o:entries){
			Map.Entry entry=(Map.Entry) o;
			String key=(String)entry.getKey();
			String value=(String)entry.getValue();
			System.out.printf("(¡‰ %s ,≠» %s)%n",key,value);
		}
	}
}
