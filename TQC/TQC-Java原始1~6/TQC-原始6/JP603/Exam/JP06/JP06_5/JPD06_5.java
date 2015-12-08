import java.util.*;

...

class JPD06_5 {
    public static void main(String args[]) {
        ...
            Deliver d1 = new Deliver();
            d1.addProduct(new A(new Apple(), new Banana()));
            d1.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
            d1.addProduct(new B(new Banana(), new Pudding(), new Strawberry()));
            d1.addProduct(new B(new Apple(), new Banana(), new Mango()));
            System.out.println("a Price: " + d1.getTotalPrice());
            System.out.println("a Cost: " + d1.getTotalCost());
            System.out.println("a Profit: " + d1.getTotalProfit());
            System.out.println("");
            d1.checkOut();            
            Deliver d2 = new Deliver();
            d2.addProduct(new B(new Apple(), new Banana(), new Mango()));
            d2.addProduct(new A(new Apple(), new Banana()));
            System.out.println("b Price: " + d2.getTotalPrice());
            System.out.println("b Cost: " + d2.getTotalCost());
            System.out.println("b Profit: " + d2.getTotalProfit());
            d2.checkOut();                
        ...
    }
}

