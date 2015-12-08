class Customer{
	String name;
	Customer(String name){
		this.name=name;
	}
}
public class CallByValue {

	public static void some(Customer c){
		c.name="Juhn";
	}
	public static void other(Customer c){
		c=new Customer("Bill");
	}	
	public static void main(String[] args) {
		Customer c1=new Customer("Justin");
		some(c1);                       // Justin變成Juhn。
		System.out.println(c1.name);
		Customer c2=new Customer("Justin");
		other(c2);                      // 新增了另一個物件 。
		System.out.println(c2.name);
		
	}
}
