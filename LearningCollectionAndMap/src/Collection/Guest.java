package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Guest {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		List list=new ArrayList();
		String name;
		while(true){
			System.out.print("訪客名稱：");
			name=scanner.nextLine();
			if(name.equals("quit")){
				break;
			}
			list.add(name);
		}
		System.out.println("訪客名單：");
		foreach(list);
	}
	private static void foreach(List list){
		for(int i=0;i<list.size();i++){
			String guest=(String)list.get(i);
			System.out.println(guest.toUpperCase());
		}
	}
}
