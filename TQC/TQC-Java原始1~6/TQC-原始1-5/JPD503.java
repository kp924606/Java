public class JPD05 {
    final static int ROW = 2;
    final static int COL = 3;

    public static void main(String args[]) {
        int A[][] = {{1,2,3}, {4,5,6}};
        int B[][] = {{7,8,9}, {10,11,12}};
        int C[][] = new int[ROW][COL];
       
        System.out.printf("�}�CA�����e��(3x3)�G\n");   
        show(A);
       
        System.out.printf("\n�}�CB�����e��(3x3)�G\n");   
        show(B);
       
        add(A, B, C);
       
        System.out.printf("\n�}�CA+B=C�A�}�CC�����e��(3x3)�G\n");   
        show(C);
    }
    
    public static void add(________________) {
        ...
    }
    
    public static void show(________) {
        ...
    }
}