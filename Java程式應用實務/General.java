public class General extends Account{      // �@��C
	public General(String name, int many) {
		super(name, many);		
	}	
	public int calculateInterest() {	// �p��Q���C	
		return (int)(many*0.06)-100;    // �ন����D�ػݨD�A����ĳ�C
	}	
	public void creditAccount(int getmany){		// ���ú�I�A�@��C
		if(getmany<getCurrentBalance()){ 		// ���i�z��C
			this.many-=getmany;
		}
	}
}