package problem3;

public class SavingsAccount extends Account {
	private double rate;
	
	public AccountType getAcctType() {
		return Account.SAVINGS;
	}

	SavingsAccount(Employee emp, double balance, double rate) {
		super(emp, balance);
		this.rate = rate;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SAVINGS";
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (rate/100)*baseBalance;
		return baseBalance + interest;
	}


}
