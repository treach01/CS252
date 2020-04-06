package question1;

public class SalariedEmployee extends Employee {
	private int wkhrs;
	
	//default constructor
	public SalariedEmployee() {
	}
	
	//constructor w/params
	public SalariedEmployee(String name, int id, String ssn, String add, int age, String dept, String resp, int salary, int wkhr) {
		super();
		this.name = name;
		this.ID = id;
		this.SSN = ssn;
		this.address = add;
		this.age = age;
		this.dept = dept;
		this.responsibilities = resp;
		this.salary = salary;
		this.wkhrs = wkhr;
	}
	
	@Override
	int totalSalary() {
		return (wkhrs * 10) + salary;
	}

}
