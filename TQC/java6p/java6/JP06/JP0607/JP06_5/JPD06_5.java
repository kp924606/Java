  public class JPD06_5 {
   public static void main(String[] arge){
       
       ...
       int i , j , i_max , j_max,cost,sum=0;
       double ratio;
       i_max = salary.length ;
       j_max = salary[0].length ;
       cost=1500+1515+1858+180+200+360;
       
      ...
             

       ratio=(double)(sum-cost)/cost*100;
            
       System.out.print("總銷售總成本="+cost);
       System.out.println();
       System.out.print("總銷售總營業額="+sum);
       System.out.println();
       System.out.printf("總銷售銷售毛利率=%.2f",ratio);
       System.out.print("%");
       System.out.println();
       }
   }
