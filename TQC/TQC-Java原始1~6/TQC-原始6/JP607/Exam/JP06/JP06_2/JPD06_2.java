
...

public class JPD06_2 {
    public static void main(String args[]){

        BasicNB bc = new BasicNB(1,"basic");
        System.out.println("�ӥιq������: " + bc.cost());
        System.out.println("�ӥιq�����: " + bc.price());
    
        LuxNB lc = new LuxNB(2,"Lux");
        System.out.println("�������֤߹q������: " + lc.cost());
        System.out.println("�������֤߹q�����: " + lc.price());
    }
}