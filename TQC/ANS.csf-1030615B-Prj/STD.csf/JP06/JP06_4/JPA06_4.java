package JP06.JP06_4;
import java.util.HashMap;

//�إߩ�H���O�Ѥl���O�~��
abstract class Employee {
	String wno;
	static int count=0;
	static double totalTaxes=0.0;
	Employee(String s) {wno=s; count++;}
	//�إߤ@�ӨC�리�J��H����k
	abstract double monthPay();
	void isHigher(Employee w){
		if(monthPay() >= w.monthPay())
			System.out.println(wno + "����");
		else 
			System.out.println(w.wno + "����");
	}
	double monthTaxes() {
		totalTaxes += 0.15 * monthPay();
		return 0.15 * monthPay();
	}
	static double getAverageTax() {
		return totalTaxes / count;
	}
}

//�إߤ@��SalaryWorker���O�A�~��Employee�A�b����k�����g�J���Q�ܼơA���]�w��0
class SalaryWorker extends Employee {
	int yp;//�~�~
	int bonus=0;//���Q
	//�غc�l��l�ƭ��u�s���B�~�~
	SalaryWorker(String s ,int i) {super(s); yp=i;}
	double monthPay() {return yp/12.0+bonus;}
}

//�إߤ@��HourlyWorker���O�A�~��Employee
class HourlyWorker extends Employee {
	int hp,hr;
	//�غc�l��l�ƭ��u�s���B�u�@�ɼơB���~
	HourlyWorker(String s,int i1,int i2) {super(s); hp=i1; hr=i2;}
	double monthPay() {return 1.0*hp*hr;}
}

//�إߤ@�ӥD�����O�~��SalaryWorker�A�ӳB�N���Q���ܼƭ��s�g�J
class Manager extends SalaryWorker {
	Manager(String s,int i ,int i1) { super(s,i); bonus=i1;}
} 

//�إߤ@�Ӻ޲z�����O
class Management{
	HashMap<String, Employee> workers= new HashMap<String, Employee>();
	void put(String s, Employee w) {workers.put(s, w);}
	//�إߤ�k���o�����|�᪺�~��
	double afterTax(String s ) {
		Employee w = workers.get(s);
		return w.monthPay() - w.monthTaxes();
	}
} 

public class JPA06_4 {
  public static void main(String argv[]) {
      SalaryWorker sw1 = new SalaryWorker("96001",180000);
      HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
      Manager ma1 = new Manager("97001", 240000, 5000);        
      //�إߤ@�Ӻ޲z������
      Management m = new Management();
      //�N��Ʃ��HashMap��
      m.put("96001", sw1);
      m.put("96002", hw1);
      m.put("97001", ma1);
      System.out.println("97001 ���|���~��G " + m.afterTax("97001"));
  }
}