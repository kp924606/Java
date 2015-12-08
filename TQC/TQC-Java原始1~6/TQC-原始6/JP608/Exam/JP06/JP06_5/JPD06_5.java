...

class JPD06_5
{
    public static void main(String args[])
    {
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        economy.setPriceRatio(1.2);
        
        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        valuedChoice.setPriceRatio(1.3);
        
        SaleReport sr = new SaleReport();
        sr.add(economy);
        sr.add(valuedChoice);
        System.out.println( sr.getNumberOfLunchBox() + " lunch boxes have been sold.");
        System.out.println("Profit is " + sr.getProfit() + ".");
        
    }
}