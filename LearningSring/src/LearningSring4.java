public class LearningSring4 {
	public static void main(String[] args) {
		char[] name={'A','p','p','l','e'};
		String name1=new String(name); // 建立物件。
		String name2=new String(name); // 建立物件。
		System.out.println("name1==name2 ? "+ (name1==name2)); // 2個分別是獨立的物件。
		
		String name3="App";
		String name4="App";
		System.out.println("name3==name4 ? "+ (name3==name4)); // 序列、大小相同，都只會建立一個實例。
	
		String name5="Xcode";
		String name6="Xcode";
		String name7=new String("Xcode");
		String name8=new String("Xcode");
		System.out.println("name5==name6 ? "+ (name5==name6)); // 序列、大小相同，都只會建立一個實例。
		System.out.println("name5==name7 ? "+ (name5==name7)); // 2個分別是獨立的物件。
		System.out.println("name7==name8 ? "+ (name7==name8)); // 2個分別是獨立的物件。
		System.out.println("name5 equals name6 ? "+ (name5.equals(name6)));// 2個內容相同。
		System.out.println("name5 equals name7 ? "+ (name5.equals(name7)));// 2個內容相同。
		System.out.println("name7 equals name8 ? "+ (name7.equals(name8)));// 2個內容相同。
	}
}
