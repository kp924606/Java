package Collection;
import java.util.HashSet;
import java.util.Set;
class Student{
	private String name;
	private String number;
	Student(String name,String number){
		this.name=name;
		this.number=number;
	}
	public String toString(){
		return String.format("(%s, %s)",name,number);
	}	
}
public class Students {	
	public static void main(String[] args) {		
		Set set=new HashSet();
		set.add(new Student("Hero", "A9527"));
		set.add(new Student("Albert", "B1955"));
		set.add(new Student("DaVinci", "C1519"));
		set.add(new Student("Hero", "A9527"));
		System.out.println(set);		
	}
}
