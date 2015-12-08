...

class JPD06_1
{
    public static void main(String args[])
    {
        Rice rice = new Rice(100);
        System.out.println( rice.getAmount() + " grams of rice has " + rice.getCalorie() + " calories.");
        
        Egg egg = new Egg(30);
        System.out.println( egg.getAmount() + " grams of egg has " + egg.getCalorie() + " calories.");
        
        Cabbage cabbage = new Cabbage(50);
        System.out.println( cabbage.getAmount() + " grams of cabbage has " + cabbage.getCalorie() + " calories.");
        
        PorkRib porkRib = new PorkRib(300);
        System.out.println( porkRib.getAmount() + " grams of pork rib has " + porkRib.getCalorie() + " calories.");
        
        Carrot carrot = new Carrot(100);
        System.out.println( carrot.getAmount() + " grams of carrot has " + carrot.getCalorie() + " calories.");  
    }
}