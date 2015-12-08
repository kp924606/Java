class Other{
	{
		System.out.println("物件初始區塊...");
	}
	Other(){
		System.out.println("other()建構式...");
	}
	Other(int o){
		this();
		System.out.println("other(int o)建構式...");
	}
}
public class ObjectInitialBlock {
	public static void main(String[] args) {
		new Other(1);
	}
}
