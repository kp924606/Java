package TryCatchFinally;
class Resource implements AutoCloseable{	
	public void close() throws Exception {
		System.out.println("資源被關閉");
	}
	void doSome(){
		System.out.println("做一些事");
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
