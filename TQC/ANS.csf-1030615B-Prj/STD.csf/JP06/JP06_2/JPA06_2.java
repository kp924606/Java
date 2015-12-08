package JP06.JP06_2;
//建立抽象類別供子類別繼承
abstract class Employee {
	String wno;
	Employee(String s) {wno=s;}
	//建立一個每月收入抽象的方法
	abstract double monthPay();
	void isHigher(Employee w){
		if(monthPay() >= w.monthPay())
			System.out.println(wno + "較高");
		else 
			System.out.println(w.wno + "較高");
	}
	double monthTaxes() {
		return 0.15 * monthPay();
	}
}

//建立一個SalaryWorker類別，繼承Employee，在此方法中有寫入紅利變數，但設定成0
class SalaryWorker extends Employee {
	int yp;//年薪
	int bonus=0;//紅利
	//建構子初始化員工編號、年薪
	SalaryWorker(String s ,int i) {super(s); yp=i;}
	double monthPay() {return (yp/12.0+bonus);}
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

public class JPA06_2 {
  public static void main(String argv[]) {
      
      SalaryWorker sw1 = new SalaryWorker("96001",180000);
      System.out.println("SalaryWorker：" + sw1.monthPay());
      HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
      System.out.println("HourlyWorker：" + hw1.monthPay());
      Manager ma1 = new Manager("97001", 240000, 5000);
      System.out.println("Manager：" + ma1.monthPay());

      //比較(物件)sw1和(物件)hw1誰的薪水高
      sw1.isHigher(hw1);
      //比較(物件)hw1和(物件)ma1誰的薪水高
      hw1.isHigher(ma1);
      //取得每個人的應繳稅額
      System.out.println("SalaryWorker稅額：" + sw1.monthTaxes());
      System.out.println("HourlyWorker稅額：" + hw1.monthTaxes());
      System.out.println("Manager稅額：" + ma1.monthTaxes());    
  }
}