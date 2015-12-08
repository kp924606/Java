abstract public class Account { // 帳號。
	String name;
	int many;
	public Account(String name,int many){
		this.name=name;
		this.many=many;
	}	
	abstract public int calculateInterest();	// 計算利息，方式分開。			
	public int getCurrentBalance(){			// 取得當前餘額，方式都一樣。			
		return this.many;
	}		
}
