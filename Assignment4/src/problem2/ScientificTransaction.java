package problem2;

public class ScientificTransaction extends Book {
	//attriutes
	private String confname;
	private String location;
	private String date;
	private int totExpense;
	
	//constructor
	public ScientificTransaction(int p, int c, int totexp, String confname)
	{	super.price = p;
		super.copies = c;
		this.totExpense = totexp;
		this.confname = confname;}
	
	//method
	public String getConfname() {
		return confname;
	}
	//setters and getters babyyyy
	public void setConfname(String confname) {
		this.confname = confname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotExpense() {
		return totExpense;
	}

	public void setTotExpense(int totExpense) {
		this.totExpense = totExpense;
	}

	@Override
	public int pricepercopy() {
		return totExpense/copies;}
	
	@Override
	public String toString() {
		String newline = System.getProperty("line.separator");
		String ret = "Conferece:" + confname + newline + 
				"Total copies:" + copies;
		return ret;
	}
}
