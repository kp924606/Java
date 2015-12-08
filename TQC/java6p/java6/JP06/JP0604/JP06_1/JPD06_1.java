

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
                System.out.println("定期存款：" + deposit.balance());
		System.out.println("活期存款：" + free.balance());
		System.out.println("優惠存款：" + special.balance());		
		FundAccount fund = new FundAccount("peter", "A", free, special);
		fund.buy(15000, 500);
		System.out.println("基金現額：" + fund.balance(300));
		System.out.println("活期餘額：" + fund.freeAccount.balance());
	}
}