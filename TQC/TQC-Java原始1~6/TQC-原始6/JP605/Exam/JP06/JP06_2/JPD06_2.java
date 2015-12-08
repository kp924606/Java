
...

public class JPD06_2 {
   public static void main(String argv[]) {
        MIS s3 = new ITM("Mary", 79, 88, 94, 92, 83, 69);
        System.out.printf("Mary's elect score: %.2f all score %.2f\n", s3.averageElect(), s3.averageAll());
    }
}