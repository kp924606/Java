package TryCatchFinally;
class ResourceSome implements AutoCloseable{	
	public void close() throws Exception {
		System.out.println("�귽�Q����");
	}
	void doSome(){
		System.out.println("���@�Ǩ�");
	}
}
class ResourceOther implements AutoCloseable{	
	public void close() throws Exception {
		System.out.println("�귽Other�Q����");
	}
	void doOther(){
		System.out.println("���䥦��");
	}
}
public class Main2 {
	public static void main(String[] args) {
		try (ResourceSome some=new ResourceSome();ResourceOther other=new ResourceOther()){
			some.doSome();
			other.doOther();
		} catch (Exception ex) {  // �b try ���A�����A�V�᭱���g������귽�|�V���Q�����C
			ex.printStackTrace();
		}
	}
}
