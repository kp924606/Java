
...

public class JPD06_2 {
    public static void main(String args[]){

        BasicNB bc = new BasicNB(1,"basic");
        System.out.println("商用電腦成本: " + bc.cost());
        System.out.println("商用電腦售價: " + bc.price());
    
        LuxNB lc = new LuxNB(2,"Lux");
        System.out.println("高階雙核心電腦成本: " + lc.cost());
        System.out.println("高階雙核心電腦售價: " + lc.price());
    }
}