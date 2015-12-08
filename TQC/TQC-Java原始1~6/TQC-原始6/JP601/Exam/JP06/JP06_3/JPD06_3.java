
...

public class JPD06_3 {
    public static void main(String args[]) {
        SLuxCar llc = new SLuxCar(2000,"Auto");
        System.out.println("SLux cost: "  + llc.cost());
        System.out.println("SLux price: " + llc.price());
        LuxCar lc = new LuxCar(2000,"Auto");
        System.out.println("Is llc more expensive than lc? " + llc.expensive(lc));
   }
}