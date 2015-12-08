public class Platinum extends Account{ 		// 白金。
	public Platinum(String name, int many) {
		super(name, many);		
	}	
	public int calculateInterest() {	// 計算利息。		
		return (int)(many*0.05)-100; 	// 轉成整數題目需求，不建議。
	}	
	public void debitAccount(int getmany){	    // 先讓對方透支在收錢，白金。
		this.many-=getmany;						// 可以透支，所以可能會是負債。
	}	
}
