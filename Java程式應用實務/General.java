public class General extends Account{      // 一般。
	public General(String name, int many) {
		super(name, many);		
	}	
	public int calculateInterest() {	// 計算利息。	
		return (int)(many*0.06)-100;    // 轉成整數題目需求，不建議。
	}	
	public void creditAccount(int getmany){		// 當場繳付，一般。
		if(getmany<getCurrentBalance()){ 		// 不可透支。
			this.many-=getmany;
		}
	}
}