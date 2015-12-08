...

class JPD06_2
{
    public static void main(String args[])
    {
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        System.out.println("Total calories of an economy lunch box are " + economy.getCalorie() +".");
        
        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie()+".");
        
    }
}