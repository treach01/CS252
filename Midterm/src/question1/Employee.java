package question1;

public class Employee {
	protected String name;
	protected int ID;
	protected String SSN;
	protected String address;
	protected int age;
	protected String dept;
	protected String responsibilities;
	protected int salary;
	
	// default constructor
	public Employee() {
		
	}
	//constructor w/params
	public Employee(String name, int id, String ssn, String add, int age, String dept, String resp, int salary) {
		this.name = name;
		this.ID = id;
		this.SSN = ssn;
		this.address = add;
		this.age = age;
		this.dept = dept;
		this.responsibilities = resp;
		this.salary = salary;
	}
	
	public String reportingTo() {
		return "this is my boss' name";
	}
	
	public int baseSalary() {
		return salary;
	}
	
	
	int totalSalary() {
		return 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
