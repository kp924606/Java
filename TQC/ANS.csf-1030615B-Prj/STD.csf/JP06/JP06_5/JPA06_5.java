package JP06.JP06_5;
import java.util.HashMap;

//建立抽象類別供子類別繼承
abstract class Employee {
	String wno;
	static int count=0;
	static double totalTaxes=0.0;
	Employee(String s) {wno=s; count++;}
	//建立一個每月收入抽象的方法
	abstract double monthPay();
	void isHigher(Employee w){
		if(monthPay() >= w.monthPay())
			System.out.println(wno + "較高");
		else 
			System.out.println(w.wno + "較高");
	}
	double monthTaxes() {
		totalTaxes += 0.15 * monthPay();
		return 0.15 * monthPay();
	}
	static double getAverageTax() {
		return totalTaxes / count;
	}
}

//建立一個SalaryWorker類別，繼承Employee，在此方法中有寫入紅利變數，但設定成0
class SalaryWorker extends Employee {
	int yp;//年薪
	int bonus=0;//紅利
	//建構子初始化員工編號、年薪
	SalaryWorker(String s ,int i) {super(s); yp=i;}
	double monthPay() {return yp/12.0+bonus;}
}

//建立一個HourlyWorker類別，繼承Employee
class HourlyWorker extends Employee {
	int hp,hr;
	//建構子初始化員工編號、工作時數、時薪
	HourlyWorker(String s,int i1,int i2) {super(s); hp=i1; hr=i2;}
	double monthPay() {return 1.0*hp*hr;}
}

//建立一個主管類別繼承SalaryWorker，該處將紅利的變數重新寫入
class Manager extends SalaryWorker {
	Manager(String s,int i ,int i1) { super(s,i); bonus=i1;}
} 

//建立一個管理的類別
class Management{
	HashMap<String, Employee> workers;
	//建構子初始化始化物件為HashMap
	Management() {workers = new HashMap<String, Employee>();}
	//建立方法將物件放入HashMap中
	void put(String s, Employee w) {workers.put(s, w);}
	//建立方法取得扣除稅後的薪資
	double afterTax(String s ) {
		Employee w = (Employee)workers.get(s);
		return w.monthPay() - w.monthTaxes();
	}
	void totalSalary() throws LimitException {
		double sum=0.0;
		for(Employee e : workers.values()) {
			sum += e.monthPay();
		}
		if(sum > 50000.0) 
			throw new LimitException(sum);
		else
			System.out.println("Total salary: " + sum);
	}
} 

class LimitException extends Exception {
	LimitException(double m) {
		super("Total salary exceed limit: " + m);
	}
}

public class JPA06_5 {
    public static void main(String argv[]) {
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
        Manager ma1 = new Manager("97001", 240000, 5000);        
        Management m = new Management();
        m.put("96001", sw1);
        m.put("96002", hw1);
        m.put("97001", ma1);
        //抓取錯誤訊息
        try {
        	m.totalSalary();
		} catch (LimitException e) {System.out.println(e.getMessage());}
	}
}
