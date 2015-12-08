package JP06.JP06_1;
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

class Note {
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


class JPA06_1 {
    public static void main(String args[]){
        MiniNote mininote = new MiniNote();
        System.out.println("MiniNote cost:"+mininote.getCost()+", price:"+mininote.getPrice());
        Note15 note15 = new Note15();
        System.out.println("Note15 cost:"+note15.getCost()+", price:"+note15.getPrice());        
    }
}