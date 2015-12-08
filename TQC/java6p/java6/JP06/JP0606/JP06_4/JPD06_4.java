
...

public class JPD06_4 {
    public static void main(String argv[]) {
        PartTimeTeacher p1 = new PartTimeTeacher("John",400,2);
        PartTimeTeacher p2 = new PartTimeTeacher("Mary",300,4);
        FullTimeTeacher f1 = new FullTimeTeacher("Peter",400,9);
        FullTimeTeacher f2 = new FullTimeTeacher("Paul",300,12);
        FullTimeTeacher f3 = new FullTimeTeacher("Eric",350,15);
        Manager am1 = new Manager("Fang", 500, 12, 3);
                
        TeacherDB school = new TeacherDB();
        school.store("John", p1);
        school.store("Mary", p2);
        school.store("Peter", f1);
        school.store("Paul", f2);
        school.store("Eric", f3);
        school.store("Fang", am1);
        System.out.println("Total salary: " + school.totalOfAll());
    }
}