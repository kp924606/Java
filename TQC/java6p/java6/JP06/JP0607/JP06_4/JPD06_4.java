 public class JPD06_4 {
   public static void main(String[] arge){
       String[] map = { "�_��" , "����" , "�n��" };
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
           System.out.print("��"+(i+1)+"�����穱�P���`����="+cost[i]);
           System.out.println();
           System.out.print("�P���`��~�B="+sum[i]);
           System.out.println();
           System.out.printf("�P��P���Q=%.2f",ratio);
           System.out.print("%");
           System.out.println();
           System.out.println();
        }
      }
    }