
...

class JPD06_3 {
    public static void main(String args[]) {
        C t1 = new C (new Apple(), new Banana());
	D t2 = new D (new Banana(), new Pudding(), new Strawberry());
	D t3 = new D (new Apple(), new Banana(), new Mango());

        System.out.println("t1 cost:" + t1.getCost());
    	System.out.println("t1 price:" + t1.getPrice());
        System.out.println("t1 profit:" + t1.getProfit());
        System.out.println("t2 cost:" + t2.getCost());
    	System.out.println("t2 price:" + t2.getPrice());
        System.out.println("t2 profit:" + t2.getProfit());
        System.out.println("t3 cost:" + t3.getCost());
    	System.out.println("t3 price:" + t3.getPrice());
        System.out.println("t3 profit:" + t3.getProfit());
    }
}