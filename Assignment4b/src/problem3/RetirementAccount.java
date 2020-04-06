package problem3;

public class RetirementAccount extends Account {
	public AccountType getAcctType() {
		return Account.RETIREMENT;
	}

	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "RETIREMENT";
	}
	
	@Override
	public boolean makeWithdrawal(double amt) {
		double bal = super.getBalance();
		if(amt <= bal) {
		bal -= amt;
		
			return true;
		}
		return false;
		
	}

}
