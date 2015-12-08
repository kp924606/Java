package Collection;
import java.util.*;
public class Sort {
	public static void main(String[] args) {		
		List numbers=Arrays.asList(10,2,3,1,9,15,4);
		Collections.sort(numbers); // 按照大小排序。
		System.out.println(numbers);
	}
}
