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
			System.out.print("�X�ȦW�١G");
			name=scanner.nextLine();
			if(name.equals("quit")){
				break;
			}
			list.add(name);
		}
		System.out.println("�X�ȦW��G");
		foreach(list);
	}
	private static void foreach(List list){
		for(int i=0;i<list.size();i++){
			String guest=(String)list.get(i);
			System.out.println(guest.toUpperCase());
		}
	}
}
