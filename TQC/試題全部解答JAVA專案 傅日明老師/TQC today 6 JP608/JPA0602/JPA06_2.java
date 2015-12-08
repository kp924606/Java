
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

class NoteBook {
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

abstract class PCMultiPC {
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

class JPA06_2 {
    public static void main(String args[]){
        PC pc = new PC();
        System.out.println("PC cost:"+pc.getCost()+", price:"+pc.getPrice());
        MultiPC multipc1 = new MultiPC(2, 4);
        System.out.println("MultiPC: 2CPU, 4HD, cost:"+multipc1.getCost()+", price:"+multipc1.getPrice());
        MultiPC multipc2 = new MultiPC(4, 8);
        System.out.println("MultiPC: 4CPU, 8HD, cost:"+multipc2.getCost()+", price:"+multipc2.getPrice());
    }
}