package Collection;
import java.util.HashSet;
import java.util.Set;
class Student2{
	private String name;
	private String number;
	Student2(String name,String number){
		this.name=name;
		this.number=number;
	}
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass()!=obj.getClass()){
			return false;
		}
		final Student2 othher=(Student2) obj;
		return true;
	}
	public int hashCode(){
		int hash=5;
		hash=13*hash+(this.name!=null? this.name.hashCode():0);
		hash=13*hash+(this.number!=null? this.number.hashCode():0);
		return hash;
	}	
	public String toString(){
		return String.format("(%s, %s)",name,number);
	}	
}
public class Students2 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add(new Student2("Hero", "A9527"));
		set.add(new Student2("Albert", "B1955"));
		set.add(new Student2("DaVinci", "C1519"));
		set.add(new Student2("Hero", "A9527"));
		System.out.println(set);
	}
}