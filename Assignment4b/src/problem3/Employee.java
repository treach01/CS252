package problem3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {

	private ArrayList<Account> accounts;
	private String name;
	@SuppressWarnings("unused")
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		Account checkingAcct = new CheckingAccount(this, startAmount);
		accounts.add(checkingAcct);
	}

	public void createNewSavings(double startAmount, double rate) {
		Account savingsAcct = new SavingsAccount(this, startAmount, rate);
		accounts.add(savingsAcct);
	}

	public void createNewRetirement(double startAmount) {
		Account retirementAcct = new RetirementAccount(this, startAmount);
		accounts.add(retirementAcct);
	}

	public String getFormattedAcctInfo() {
		String newline = "\n";
		String theString = "ACCOUNT INFO FOR "+name+newline+newline;
		//System.out.println(accounts);
		for(Account c:accounts) {
			theString += c.toString()  +newline ; }
		//System.out.println(theString);
		return theString;
	}
	public void deposit(int accountIndex, double amt){
		Account selected = accounts.get(accountIndex);
		switch(selected.toString()){
			case "CHECKING":
				selected.makeDeposit(amt);
				break;
			case "SAVINGS":
				selected.makeDeposit(amt);
				break;
			case "RETIREMENT":
				selected.makeDeposit(amt);
				break;
			default:				
		}
	}
	public boolean withdraw(int accountindex, double amt){
		Account selected = accounts.get(accountindex);
		switch(selected.toString()){
		case "CHECKING" :
			return selected.makeWithdrawal(amt);
			
		case "SAVINGS":
			return selected.makeWithdrawal(amt);
			
		case "RETIREMENT":
			return selected.makeWithdrawal(amt);
			
		default:
			return false;
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
