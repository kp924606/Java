import java.util.Arrays;;
public class InheritanceArrayList {
	private Object[] list;  // 使用Object陣列收集。
	private int next; // 下一個可儲存物件的索引。
	public InheritanceArrayList(int capacity){ // 指定初始容量。
		list=new Object[capacity];
	}
	public InheritanceArrayList(){ // 初始容量預設為，16。
		this(16);
	}
	public void add(Object o){ // 收集物件方法。
		if(next==list.length){ // 自動增長Object陣列長度。
			list=Arrays.copyOf(list, list.length*2);
		}
		list[next++]=o;
	}
	public Object get(int index){ // 依索引取得收集之物件。
		return list[index];
	}
	public int size(){ // 已收集的物件個數。
		return next;
	}	
	public static void main(String[] args) {		
		
	}
}
