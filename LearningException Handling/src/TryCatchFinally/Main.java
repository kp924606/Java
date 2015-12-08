package TryCatchFinally;
class Resource implements AutoCloseable{	
	public void close() throws Exception {
		System.out.println("�귽�Q����");
	}
	void doSome(){
		System.out.println("���@�Ǩ�");
	}
}
public class Main {	
	public static void main(String[] args) {	
		try (Resource res=new Resource()){
			res.doSome();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
