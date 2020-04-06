package question1;

public class CommissionedEmployee extends Employee {
	private int[] salesperweek;
	
	//constructor
	public CommissionedEmployee() {
		
	}
	
	public CommissionedEmployee(String name, int id, String ssn, String add, int age, String dept, String resp, int salary, int[] sales) {
		super();
		this.name = name;
		this.ID = id;
		this.SSN = ssn;
		this.address = add;
		this.age = age;
		this.dept = dept;
		this.responsibilities = resp;
		this.salary = salary;
		this.salesperweek = sales;
	}
	
	@Override
	int totalSalary() {
		int sum = 0;
		for(int a: salesperweek)
		{
			sum += (a * 10);
		}
		return sum + salary;
	}

	public int[] getSalesperweek() {
		return salesperweek;
	}

	public void setSalesperweek(int[] salesperweek) {
		this.salesperweek = salesperweek;
	}

}
