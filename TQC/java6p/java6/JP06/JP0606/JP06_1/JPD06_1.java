
...

public class JPD06_1 {
    public static void main(String argv[]) {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        System.out.println("John-PartTime" + p1.salary());
        System.out.println("Mary-PartTime" + p2.salary());
        System.out.println("Peter-FulLTime" + f1.salary());
        System.out.println("Paul-FulLTime" + f2.salary());
        System.out.println("Eric-FulLTime" + f3.salary());
    }
}