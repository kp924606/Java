public class Platinum extends Account{ 		// �ժ��C
	public Platinum(String name, int many) {
		super(name, many);		
	}	
	public int calculateInterest() {	// �p��Q���C		
		return (int)(many*0.05)-100; 	// �ন����D�ػݨD�A����ĳ�C
	}	
	public void debitAccount(int getmany){	    // �������z��b�����A�ժ��C
		this.many-=getmany;						// �i�H�z��A�ҥH�i��|�O�t�šC
	}	
}
