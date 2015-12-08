package TryCatchFinally;
class ResourceSome implements AutoCloseable{	
	public void close() throws Exception {
		System.out.println("資源被關閉");
	}
	void doSome(){
		System.out.println("做一些事");
	}
}
class ResourceOther implements AutoCloseable{	
	public void close() throws Exception {
		System.out.println("資源Other被關閉");
	}
	void doOther(){
		System.out.println("做其它事");
	}
}
public class Main2 {
	public static void main(String[] args) {
		try (ResourceSome some=new ResourceSome();ResourceOther other=new ResourceOther()){
			some.doSome();
			other.doOther();
		} catch (Exception ex) {  // 在 try 的括號中，越後面撰寫的物件資源會越早被關閉。
			ex.printStackTrace();
		}
	}
}
