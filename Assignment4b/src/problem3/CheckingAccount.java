package problem3;

public class CheckingAccount extends Account {
	
	public AccountType getAcctType() {
		return Account.CHECKING;
	}

	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getBalance() {
		return super.getBalance() - 5;
	}
	
	@Override
	public String toString() {
		return "CHECKING";
	}


}
