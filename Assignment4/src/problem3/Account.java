package problem3;

class Account {
	private String AccountTitle;
	private String BranchName;
	private String AccntType;
	protected double amnt;
	
	//method
	public double CalculateProfit() {
		return amnt;
	}
	
	//constructor
	public Account() {
		
	}
	public Account(String tit, String accnttype, int amnt) {
		this.AccountTitle = tit;
		this.AccntType = accnttype;
		this.amnt = amnt;
	}

	public String getAccountTitle() {
		return AccountTitle;
	}

	public void setAccountTitle(String accountTitle) {
		AccountTitle = accountTitle;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getAccntType() {
		return AccntType;
	}

	public void setAccntType(String accntType) {
		AccntType = accntType;
	}

	public double getAmnt() {
		return amnt;
	}

	public void setAmnt(double amnt) {
		this.amnt = amnt;
	}

}
