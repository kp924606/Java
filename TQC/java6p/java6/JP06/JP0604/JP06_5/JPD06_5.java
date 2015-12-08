
...

class JPD06_5 {
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

		try {
			special.withdraw(5000);
			fund.buy(2000, 300);
			
			fund.sell(fund.getUnit(), 400);			

			InternetAccount internet = new InternetAccount();
			internet.setDeposit(deposit);
			internet.setFree(free);
			internet.setSpecial(special);
			internet.setFund(fund);

			MultiFund multi = new MultiFund();
			multi.addFund("A", fund);
			FundAccount fundB = new FundAccount("peter", "B", free, special);
			fundB.buy(2000, 50);
			multi.addFund("B", fundB);
			FundAccount fundC = new FundAccount("peter", "C", free, special);
			fundC.buy(5000, 30);
			multi.addFund("C", fundC);
						
            		fund.buy(14000, 300);
            
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}