
...

public class JPD06_2 {
    public static void main(String argv[]) {
        
        SalaryWorker sw1 = new SalaryWorker("96001",180000);
        System.out.println("SalaryWorker¡G" + sw1.monthPay());
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);
        System.out.println("HourlyWorker¡G" + hw1.monthPay());
        Manager ma1 = new Manager("97001", 240000, 5000);
        System.out.println("Manager¡G" + ma1.monthPay());

        ...

        System.out.println("SalaryWorkerµ|ÃB¡G" + sw1.monthTaxes());
        System.out.println("HourlyWorkerµ|ÃB¡G" + hw1.monthTaxes());
        System.out.println("Managerµ|ÃB¡G" + ma1.monthTaxes());    
    }
}