public class JPD05 {
    final static int ROW = 2;
    final static int COL = 3;

    public static void main(String args[]) {
        int A[][] = {{1,2,3}, {4,5,6}};
        int B[][] = {{7,8,9}, {10,11,12}};
        int C[][] = new int[ROW][COL];
       
        System.out.printf("陣列A的內容為(3x3)：\n");   
        show(A);
       
        System.out.printf("\n陣列B的內容為(3x3)：\n");   
        show(B);
       
        add(A, B, C);
       
        System.out.printf("\n陣列A+B=C，陣列C的內容為(3x3)：\n");   
        show(C);
    }
    
    public static void add(________________) {
        ...
    }
    
    public static void show(________) {
        ...
    }
}