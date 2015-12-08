import java.util.HashMap;
abstract class Employee{
	String id;
	static int count=0;
	static double totaltax=0;
	Employee(String s){
		id=s;
		count++;				
	}
	abstract public double monthPay();
	public void hightwho(Employee another){
		if(monthPay()>another.monthPay())
			System.out.printf("%s較高\n",id);
		else
			System.out.printf("%s較高\n",another.id);
	}
	public double monthTaxes(){
		totaltax+=0.15*monthPay();
		return 0.15*monthPay();
	}
	public static double getAverageTax(){
		return totaltax/count;
	}
}
class SalaryWorker extends Employee{
	int ys,rd;
	SalaryWorker(String s,int ys){
		super(s);
		this.ys=ys;
	}
	public double monthPay() {		
		return 1.0*ys/12+rd;
	}
}
class HourlyWorker extends Employee{
	int hs,h=0;
	HourlyWorker(String s,int hs,int h){
		super(s);
		this.hs=hs;
		this.h=h;
	}
	public double monthPay() {		
		return 1.0*hs*h;
	}
}
class Manager extends SalaryWorker{
	Manager(String s,int ys,int rd){
		super(s,ys);
		this.rd=rd;
	}	
}
class Management{
	HashMap<String, Employee> work=new HashMap<String, Employee>();
	public void put(String s,Employee another){
		work.put(s, another);
	}
	public double afterTax(String s) {	
		Employee another=work.get(s);
		return another.monthPay()-another.monthTaxes();
	}
}
public class JPA06_4 {
    public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
        Manager ma1 = new Manager("97001", 240000, 5000);        
        Management m = new Management();
        m.put("96001", sw1);
        m.put("96002", hw1);
        m.put("97001", ma1);
        System.out.println("97001 的稅後薪資： " + m.afterTax("97001"));
    }
}