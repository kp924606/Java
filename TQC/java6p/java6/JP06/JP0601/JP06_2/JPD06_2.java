
...

public class JPD06_2 {
    public static void main(String args[]){
        BasicCar bc = new BasicCar(1600,"Manual");
        System.out.println("Basic cost: " + bc.cost());
        System.out.println("Basic price: " + bc.price());
    
        LuxCar lc = new LuxCar(2000,"Auto");
        System.out.println("Lux cost: " + lc.cost());
        System.out.println("Lux price: " + lc.price());
    }
}