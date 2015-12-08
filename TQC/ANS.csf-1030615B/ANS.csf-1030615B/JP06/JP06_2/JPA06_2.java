abstract class Employee{
	String id;
	Employee(String s){
		id=s;
	}
	abstract public double monthPay();
	public void hightwho(Employee another){
		if(monthPay()>another.monthPay())
			System.out.printf("%s較高\n",id);
		else
			System.out.printf("%s較高\n",another.id);
	}
	public double monthTaxes(){
		return 0.15*monthPay();
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
public class JPA06_2 {
    public static void main(String argv[]) {
        
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        System.out.println("SalaryWorker：" + sw1.monthPay());
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        System.out.println("HourlyWorker：" + hw1.monthPay());
        Manager ma1 = new Manager("97001", 240000, 5000);
        System.out.println("Manager：" + ma1.monthPay());

        sw1.hightwho(hw1);
        hw1.hightwho(ma1);        	

        System.out.println("SalaryWorker稅額：" + sw1.monthTaxes());
        System.out.println("HourlyWorker稅額：" + hw1.monthTaxes());
        System.out.println("Manager稅額：" + ma1.monthTaxes());    
    }
}