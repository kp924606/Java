import java.util.ArrayList;
import java.util.Vector;

abstract class Food{
	int amount;
	int calorie;
	int unitCost;
	Food(int a){
		amount=a;
	}
	void setCaloriePerGram(int c){
		calorie=c;
	}
	void setUnitCost(int c) {
		unitCost=c;
	}
	int getAmount(){
		return amount;
	}
	int getCalorie(){
		return amount * calorie;
	}
	int getCost(){
		return unitCost * amount;
	}
	
}
class Rice extends Food{
	Rice(int a){
		super(a);
		setCaloriePerGram(1);
		setUnitCost(1);
	}
}

class Egg extends Food{
	Egg(int a){
		super(a);
		setCaloriePerGram(2);
		setUnitCost(2);
	}
}

class Cabbage extends Food{
	Cabbage(int a){
		super(a);
		setCaloriePerGram(1);
		setUnitCost(3);
	}
}

class PorkRib extends Food{
	PorkRib(int a){
		super(a);
		setCaloriePerGram(10);
		setUnitCost(8);
	}
}

class Carrot extends Food{
	
	Carrot(int a){
		super(a);
		setCaloriePerGram(1);
		setUnitCost(3);
	}
}

class LunchBox {
	int calorie;
	Vector<Food> content;
	double priceRatio;
	
	LunchBox(){
		calorie=0;
		content = new Vector<Food>();
	}
	void add(Food f){
		content.add(f);
		calorie += f.getCalorie();
	}
	void setPriceRatio(double pr){
		priceRatio = pr;
	}
	int getCalorie() {
		//return calorie;
		int sum=0;
		for(Food f:content){
			sum += f.getCalorie();
		}
		return sum;
	}
	double getPrice(){
		int sum=0;
		for(Food f:content){
			sum += f.getCost();
		}
		return sum*priceRatio;
	}
	
	double getCost(){
		int sum=0;
		for(Food f:content){
			sum += f.getCost();
		}
		return sum;
	}

	String isCheaperThan(LunchBox that){
		if(this.getPrice()<that.getPrice())
			return "Yes";
		else
			return "No";
	}
}
class SaleReport{
	ArrayList<LunchBox> sales;
	SaleReport()
	{
		sales = new ArrayList<LunchBox>();
	}
	
	public void add(LunchBox lb) {
		// TODO Auto-generated method stub
		sales.add(lb);
	}

	public int getNumberOfLunchBox() {
		// TODO Auto-generated method stub
		return sales.size();
	}

	public int getProfit() {
		// TODO Auto-generated method stub
		double total=0;
		for(LunchBox lb:sales)
		{
			total += lb.getPrice()-lb.getCost();
		}
		return (int)total;
	}
	
	
}

class JPA06_5
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