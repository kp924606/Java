
...

class JPD06_2 {
    public static void main(String args[]) {
	A t1 = new A(new Apple(), new Banana());
	B t2 = new B(new Banana(), new Pudding(), new Strawberry());
	B t3 = new B(new Apple(), new Banana(), new Mango());

        System.out.println("t1 price:" + t1.getPrice());
        System.out.println("t1 profit:" + t1.getProfit());
        System.out.println("t2 price:" + t2.getPrice());
        System.out.println("t2 profit:" + t2.getProfit());
        System.out.println("t3 price:" + t3.getPrice());
        System.out.println("t3 profit:" + t3.getProfit());
    }
}