package JP06.JP06_1;
//建立抽象類別供子類別繼承
abstract class Employee {
	String wno;
	Employee(String s) {wno=s;}
	//建立一個每月收入抽象的方法
	abstract double monthPay();
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

public class JPA06_1 {
 public static void main(String argv[]) {
     //建立一個銷售員的物件 
	   SalaryWorker sw1 = new SalaryWorker("96001",180000);
	   //取的該銷售員的月薪
     System.out.println("SalaryWorker：" + sw1.monthPay());
     //建立一個時薪人員的物件
     HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
     //取的該時薪人員的月薪
     System.out.println("HourlyWorker：" + hw1.monthPay());
     //建立一個主管的物件
     Manager ma1 = new Manager("97001", 240000, 5000);
     //取得該主管的月薪
     System.out.println("Manager：" + ma1.monthPay());
  }
}