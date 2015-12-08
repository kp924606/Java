package JP06.JP06_4;
import java.util.LinkedList;

class Part {
	int cost;
	public int getCost(){
		return cost;
	}
}

class LCD extends Part {
	LCD (int inch) {
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

class CPU extends Part {
	CPU(double speed) {
		if(speed==1.66)
			cost=6000;
		else if(speed==2.2)
			cost=8000;
		else if(speed==2.4)
			cost=11000;
		else
			cost=0;
	}
}

class HD extends Part {
	HD(int size) {
		if(size==120)
			cost = 2400;
		else if(size==160)
			cost=2800;
		else
			cost=0;
	}
}


abstract class AllPC {
	
	abstract double getPrice();
	boolean isExpensive(AllPC another){
		if(getPrice()>another.getPrice())
			return true;
		else
			return false;
	}
}

class Note extends AllPC{
	LCD lcd;
	CPU cpu;
	HD hd;
	double getPartCost(){
		return lcd.getCost()+cpu.getCost()+hd.getCost();
	}
	
	double getCost(){
		return getPartCost() * 1.4;
	}
	
	double getPrice() {
		return getPartCost() * 2;
	}
}

class MiniNote extends Note {
	MiniNote() {
		lcd = new LCD(10);
		cpu = new CPU(1.66);
		hd = new HD(120);
	}
}

class Note15 extends Note {
	Note15() {
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
	double getPartCost() {
		return cpu.getCost()*cpuNo+hd.getCost()*hdNo;
	}
	
	abstract double getCost();
	
	double getPrice() {
		return getPartCost() * 1.8;
	}
}

class PC extends PCMultiPC{

	PC(){
		cpu = new CPU(2.4);
		hd = new HD(160);
		cpuNo=1;
		hdNo=1;
	}
	double getCost() {
		return getPartCost()+500;
	}
	
}

class MultiPC extends PCMultiPC {

	MultiPC(int cn, int hn) {
		cpu = new CPU(2.4);
		hd = new HD(160);
		cpuNo=cn;
		hdNo=hn;		
	}
	
	double getCost() {
		return getPartCost()*1.2;
	}
	
}

class Order {
	
	LinkedList<AllPC> pcs;
	Order() { pcs = new LinkedList<AllPC>();}
	void in(AllPC apc) {
		pcs.add(apc);
	}
	double revenue(){
		double sum=0;
		for(AllPC apc:pcs){
			sum += apc.getPrice();
		}
		return sum;
	}
}


class JPA06_4 {
    public static void main(String args[]){
        Order ord = new Order();
        ord.in(new MiniNote());
        ord.in(new Note15());
        ord.in(new PC());
        System.out.println(ord.revenue());
    }
}