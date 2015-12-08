
import java.util.LinkedList;


class Part {
	int cost;
	public int getCost()
	{
		return cost; 
	}
}

class LCD extends Part{
	public LCD(int inch){
		if(inch==10)
			cost=2000;
		else if(inch==15)
			cost=2500;
		else if(inch==17)
			cost=3000;
		else
			cost=0;
	}
}

class HD extends Part{
	public HD(int size) {
		if(size==120)
			cost=2400;
		else if(size==160)
			cost=2800;
		else
			cost=0;
	}
}

class CPU extends Part {
	public CPU (double speed) {
		if(speed==1.66)
			cost=6000;
		else if(speed==2.2)
			cost=8000;
		else if(speed==2.4)
			cost=11000;
	}
}

class NoteBook extends AllPC{
	LCD lcd;
	CPU cpu;
	HD hd;
	public double getPartCost() {
		return cpu.getCost()+lcd.getCost()+hd.getCost();
	}
	public double getCost() {
		return getPartCost()*1.4;
	}
	
	public double getPrice() {
		return getPartCost()*2;		
	}
}

class MiniNote extends NoteBook {
	public MiniNote() {
		lcd = new LCD(10);
		cpu = new CPU(1.66);
		hd = new HD(120);
	}
}

class Note15 extends NoteBook {
	public Note15() {
		lcd = new LCD(15);
		cpu = new CPU(2.2);
		hd = new HD(160);
	}
}

abstract class PCMultiPC extends AllPC{
	CPU cpu;
	HD hd;
	int cpuNo;
	int hdNo;
	public double getPartCost() {
		return cpuNo*cpu.getCost() + hdNo*hd.getCost();
	}
	
	public double getPrice() {
		return getPartCost() * 1.8;
	}
	
	abstract double getCost();
}

class PC extends PCMultiPC{
	public PC(){
		cpu = new CPU(2.4);
		hd = new HD(160);
		cpuNo=1;
		hdNo=1;
	}

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return getPartCost()+500;
	}
}

class MultiPC extends PCMultiPC{
	public MultiPC(int cn, int hn){
		cpu = new CPU(2.4);
		hd = new HD(160);
		cpuNo=cn;
		hdNo=hn;		
	}

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return getPartCost()*1.2;
	}
}

abstract class AllPC {
	//abstract double getCost();
	abstract double getPrice();
	abstract double getCost();
	
	public boolean isExpensive(AllPC another){
		if(this.getPrice() >= another.getPrice())
			return true;
		else
			return false;
	}
}

class Order {
	LinkedList<AllPC> pcs =new LinkedList<AllPC>();
	
	public void in(AllPC pc) throws Exception{
		pcs.add(pc);
		if(profit()>20000)
			throw new Exception();
	}
	
	public double revenue(){
		double sum=0.0;
		
		for(AllPC apc : pcs)
		{
			sum = sum + apc.getPrice();
		}
		return sum;
	}
	
	public double profit() {
        double sum=0.0;
		
		for(AllPC apc : pcs)
		{
			sum = sum + (apc.getPrice()-apc.getCost());
		}
		return sum;
	}
	
}


class JPA06_5 {
    public static void main(String args[]){
        Order ord = new Order();
        try {
            ord.in(new MiniNote());
            ord.in(new Note15());
            //ord.in(new PC());
            ord.in(new MultiPC(3,6));
        }catch(Exception e)
        {
        	System.out.println("This order exceeds 20000:"+ord.profit());
        }
    }
}