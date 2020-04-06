package problem1;

public class Seceratary extends DeptEmployee {
	private double overtimehours;
	
	public Seceratary(double overti, double salary)
	{ 	super.salary = salary;
		this.overtimehours = overti; }
		

	public double getOvertimehours() {
		return overtimehours;
	}

	public void setOvertimehours(int overtimehours) {
		this.overtimehours = overtimehours;
	}
	
	@Override
	double computeSalary() {
		return salary + 12 * overtimehours;
	}
	
}
