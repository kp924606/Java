
...

public class JPD06_3 {
    public static void main(String argv[]) {
      SalaryWorker sw1 = new SalaryWorker("96001",180000);        
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
        Manager ma1 = new Manager("97001", 240000, 5000);
       
        System.out.println("SalaryWorker�|�B�G" + sw1.monthTaxes());
        System.out.println("HourlyWorker�|�B�G" + hw1.monthTaxes());
        System.out.println("Manager�|�B�G" + ma1.monthTaxes()); 
        System.out.println("�����|�B�G" + Employee.getAverageTax());
    }
}