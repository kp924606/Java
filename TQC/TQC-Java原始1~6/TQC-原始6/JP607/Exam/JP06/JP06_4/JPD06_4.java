 public class JPD06_4 {
   public static void main(String[] arge){
       String[] map = { "北部" , "中部" , "南部" };
       int[][] salary = {{ 120 , 420 , 315 , 250 , 418,818,900 } , { 312 , 183 , 215 , 89 , 83,600,700 } , { 215 , 500 , 430 , 210 , 300,918,880 }};
       int cost[] = {0,0,0};
       int sum[] = {0,0,0,0,0,0,0};
       int data[] = {0,0,0};
       int[][]  a_box = salary ;
       
       int i , j , i_max , j_max, min;
       double ratio;
       
      ...
       
       for( i = 0 ; i <  i_max ; i++ ){
           
           ...      
           System.out.print("第"+(i+1)+"間直營店銷售總成本="+cost[i]);
           System.out.println();
           System.out.print("銷售總營業額="+sum[i]);
           System.out.println();
           System.out.printf("銷售銷售毛利=%.2f",ratio);
           System.out.print("%");
           System.out.println();
           System.out.println();
        }
      }
    }