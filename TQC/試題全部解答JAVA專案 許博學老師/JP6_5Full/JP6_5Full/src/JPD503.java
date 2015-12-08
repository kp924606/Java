// 第五類:503-矩陣之和
public class JPD503 {
    final static int ROW = 2;
    final static int COL = 3;

    public static void main(String args[]) {
        int A[][] = {{1,2,3}, {4,5,6}};
        int B[][] = {{7,8,9}, {10,11,12}};
        int C[][] = new int[ROW][COL];
       
        System.out.printf("陣列A的內容為(2x3)：\n");   
        show(A);
       
        System.out.printf("\n陣列B的內容為(2x3)：\n");   
        show(B);
       
        add(A, B, C);
       
        System.out.printf("\n陣列A+B=C，陣列C的內容為(3x3)：\n");   
        show(C);
    }
    
    public static void add(int a[][], int b[][], int c[][]) {
        for(int i = 0; i < ROW; i++)
            for(int j = 0; j < COL; j++)
                c[i][j] = a[i][j] + b[i][j];
    }
    
    public static void show(int c[][]) {
        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++)
                System.out.printf("%02d ", c[i][j]);

            System.out.printf("\n");
        }
    }
}
