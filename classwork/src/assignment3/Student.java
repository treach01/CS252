package assignment3;

public class Student {
	//unique class attributes
	private String name;
	private int roll_no;
	private int phone;
	private String address;
	
	//object
	private static Student po;
	//constructor
	public Student()
	{}
	public Student(String name, int roll_no, int phone, String address)	
	{	this.name = name;
		this.roll_no = roll_no;
		this.phone = phone;
		this.address = address;
		}
	//factory
	public static Student factory()
	{ po = new Student();
		return po;
		}	
	//getters and setters
	public int getPhone() {
		return phone;}
	public void setPhone(int phone) {
		this.phone = phone;}
	public String getAddress() {
		return address;}
	public void setAddress(String address) {
		this.address = address;}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;}
	public int getRoll_no() {
		return roll_no;}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;}
	
}
