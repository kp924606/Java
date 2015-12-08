package Collection;
import java.util.*;
public class Sort6 implements Comparator<String>{	
	public int compare(String s1, String s2) {		
		return -s1.compareTo(s2);
	}
	public static void main(String[] args) {
		List words=Arrays.asList("B","Z","A","M","C","W","O");
		Collections.sort(words,new Sort6());
		System.out.println(words);
	}
}
