
...

public class JPD06_2 {
    public static void main(String argv[]) {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        
        System.out.println("John-afterTaxIns¡G" + p1.afterTaxIns());
        System.out.println("Mary-afterTaxIns¡G" + p2.afterTaxIns());
        System.out.println("Peter-afterTaxIns¡G" + f1.afterTaxIns());
        System.out.println("Paul-afterTaxIns¡G" + f2.afterTaxIns());
        System.out.println("Eric-afterTaxIns¡G" + f3.afterTaxIns());

        Manager am1 = new Manager("Fang", 500, 12, 3);
        System.out.println("Fang-Manager¡G" + am1.getTotalSalary());
        System.out.println("Fang-afterTaxIns¡G" + am1.afterTaxIns());


    }
}