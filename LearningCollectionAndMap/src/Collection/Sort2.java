package Collection;
import java.util.*;
class Account implements Comparable{
	private String name;
	private String number;
	private int balance;
	Account(String name,String number,int balance){
		this.name=name;
		this.number=number;
		this.balance=balance;		
	}
	public String toString(){
		return String.format("Account(%s, %s, %d)", name,number,balance);
	}	
	public int compareTo(Object o) {
		Account other=(Account)o;		
		return this.balance-other.balance;
	}
}
public class Sort2 {
	public static void main(String[] args) {
		List accounts=Arrays.asList(new Account("Hero", "A9527", 100),new Account("Albert", "B1234", 500),new Account("DaVinci", "C9876", 200));
		Collections.sort(accounts);
		System.out.println(accounts);
	}
}
