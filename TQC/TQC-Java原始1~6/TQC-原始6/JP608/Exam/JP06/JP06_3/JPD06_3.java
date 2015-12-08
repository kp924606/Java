...

class JPD06_3
{
    public static void main(String args[])
    {
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        economy.setPriceRatio(1.2);
        System.out.println("Total calories of an economy lunch box are " + economy.getCalorie());
        System.out.println("The price of an economy lunch box is " + economy.getPrice());
        
        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        valuedChoice.setPriceRatio(1.3);
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie());
        System.out.println("The price of a valued-choice lunch box is " + valuedChoice.getPrice());        
    }
}