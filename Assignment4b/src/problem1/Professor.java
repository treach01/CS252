package problem1;

public class Professor extends DeptEmployee {
	private int numofpubs;
	
	public Professor(int numofpubs, double salary)
	{ 	super.salary = salary;
		this.numofpubs = numofpubs;
		
	}
	public int getNumofpubs() {
		return numofpubs;
	}

	public void setNumofpubs(int numofpubs) {
		this.numofpubs = numofpubs;
	}
	
	
	
}
