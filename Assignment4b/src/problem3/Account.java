package problem3;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	public static AccountType CHECKING=new AccountType("checking");
	public static AccountType SAVINGS=new AccountType("savings");
	public static AccountType RETIREMENT=new AccountType("retirement");
	private double balance;
	@SuppressWarnings("unused")
	private Employee employee;
	
	Account(Employee emp, double balance){
		this.employee = emp;
		this.balance = balance;
	}
	
	Account(Employee emp){
		this(emp,DEFAULT_BALANCE);	
		
	}
	public double getBalance() {
		return balance;
	}
	
//	public String toString() {
//		String newline = System.getProperty("line.separator");
//		return "Account type: "+ AccountType.toString().toLowerCase()+
//				newline +
//				"Current bal: "+balance;
//	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}
	public boolean makeWithdrawal(double amount) {
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	public String toString() {
		return "Account";
	}
}