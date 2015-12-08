

class JPD06_1 {
	public static void main(String args[]) {
		DepositAccount deposit = new DepositAccount("peter", 2);
		deposit.deposit(5000);
		FreeAccount free = new FreeAccount("peter");
		free.deposit(20000);
		SpecialAccount special = new SpecialAccount("peter");
		special.deposit(10000);
		deposit.addInterest();
		free.addInterest();
		special.addInterest();
                System.out.println("�w���s�ڡG" + deposit.balance());
		System.out.println("�����s�ڡG" + free.balance());
		System.out.println("�u�f�s�ڡG" + special.balance());		
		FundAccount fund = new FundAccount("peter", "A", free, special);
		fund.buy(15000, 500);
		System.out.println("����{�B�G" + fund.balance(300));
		System.out.println("�����l�B�G" + fund.freeAccount.balance());
	}
}