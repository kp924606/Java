
...

class JPD06_2 {
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
		FundAccount fund = new FundAccount("peter", "A", free, special);
        	fund.buy(15000, 500);
       		special.withdraw(5000);
		fund.buy(2000, 300);
		System.out.println("����l�B�G" + fund.balance(300));
		System.out.println("��X�e�����l�B�G" + fund.freeAccount.balance()); 
                fund.sell(fund.getUnit(), 400);					
		System.out.println("��X�ᬡ���l�B�G" + fund.freeAccount.balance());
	}
}