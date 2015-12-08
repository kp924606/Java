package JP06.JP06_3;
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

public class JPA06_3 {
  public static void main(String argv[]) {
      SalaryWorker sw1 = new SalaryWorker("96001",180000);        
      HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
      Manager ma1 = new Manager("97001", 240000, 5000);
      
      System.out.println("SalaryWorker�|�B�G" + sw1.monthTaxes());
      System.out.println("HourlyWorker�|�B�G" + hw1.monthTaxes());
      System.out.println("Manager�|�B�G" + ma1.monthTaxes()); 
      //�p��X�����|�B
      System.out.println("�����|�B�G" + Employee.getAverageTax());
  }
}