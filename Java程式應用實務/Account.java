abstract public class Account { // �b���C
	String name;
	int many;
	public Account(String name,int many){
		this.name=name;
		this.many=many;
	}	
	abstract public int calculateInterest();	// �p��Q���A�覡���}�C			
	public int getCurrentBalance(){			// ���o��e�l�B�A�覡���@�ˡC			
		return this.many;
	}		
}
