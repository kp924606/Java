class Other{
	{
		System.out.println("�����l�϶�...");
	}
	Other(){
		System.out.println("other()�غc��...");
	}
	Other(int o){
		this();
		System.out.println("other(int o)�غc��...");
	}
}
public class ObjectInitialBlock {
	public static void main(String[] args) {
		new Other(1);
	}
}
