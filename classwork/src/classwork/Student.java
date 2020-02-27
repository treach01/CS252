package classwork;


public class Student {
	
	private int age;
	private int id;
	private String name;
	private static int count;
	public static int fund=0;
	//object
	private static Student po;

	//constructor
	private Student()
	{}
	//factory
	public static Student factory()
	{ if(count < 3) {po = new Student();
		count++;
		return po; }			//what does po accomplish exactly
	else {return null;}
		}	
	
	//Constructor
	public Student(int id, String name)
	{    this.id= id;
		this.name = name;
		count++;}
	
	public Student(int age, int id, String name)
	{ 	this.age= age;
		this.id= id;
		this.name = name;
		count++;}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getstudentcount()
	{return count;}
	
	

}
