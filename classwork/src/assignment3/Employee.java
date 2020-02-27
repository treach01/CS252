package assignment3;

public class Employee {
	private String fname;
	private int hireyear;
	private String address;
	private int salary;
	private int hrs;
	

	public Employee(String fname, int hireyear, String address)
	{	this.fname = fname;
		this.hireyear = hireyear;
		this.address = address;}
	
	public void getEmpinfo()
	{ System.out.println(fname + hireyear + address);}
	
	public void getInfo(int salary, int hrs ) {
		this.hrs = hrs;
		this.salary = salary;}
	
	public void AddSal()
	{if(salary < 500) {
		salary += 10;
	}}
	public void Addwork()
	{ if(hrs > 6) {
		salary += 5;}
	}
	
}
