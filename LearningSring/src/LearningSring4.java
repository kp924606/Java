public class LearningSring4 {
	public static void main(String[] args) {
		char[] name={'A','p','p','l','e'};
		String name1=new String(name); // �إߪ���C
		String name2=new String(name); // �إߪ���C
		System.out.println("name1==name2 ? "+ (name1==name2)); // 2�Ӥ��O�O�W�ߪ�����C
		
		String name3="App";
		String name4="App";
		System.out.println("name3==name4 ? "+ (name3==name4)); // �ǦC�B�j�p�ۦP�A���u�|�إߤ@�ӹ�ҡC
	
		String name5="Xcode";
		String name6="Xcode";
		String name7=new String("Xcode");
		String name8=new String("Xcode");
		System.out.println("name5==name6 ? "+ (name5==name6)); // �ǦC�B�j�p�ۦP�A���u�|�إߤ@�ӹ�ҡC
		System.out.println("name5==name7 ? "+ (name5==name7)); // 2�Ӥ��O�O�W�ߪ�����C
		System.out.println("name7==name8 ? "+ (name7==name8)); // 2�Ӥ��O�O�W�ߪ�����C
		System.out.println("name5 equals name6 ? "+ (name5.equals(name6)));// 2�Ӥ��e�ۦP�C
		System.out.println("name5 equals name7 ? "+ (name5.equals(name7)));// 2�Ӥ��e�ۦP�C
		System.out.println("name7 equals name8 ? "+ (name7.equals(name8)));// 2�Ӥ��e�ۦP�C
	}
}
