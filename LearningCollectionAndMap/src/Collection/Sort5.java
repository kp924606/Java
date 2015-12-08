package Collection;
import java.util.*;
public class Sort5 implements Comparator{		
	public int compare(Object o1,Object o2) {
		String str1=(String)o1;
		String str2=(String)o2;		
		return -str1.compareTo(str2);
	}
	public static void main(String[] args) {
		List words=Arrays.asList("B","Z","A","M","C","W","O");
		Collections.sort(words,new Sort5());
		System.out.println(words);
	}
}
