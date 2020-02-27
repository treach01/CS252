package lecture2_25;

public class Professor {
	//class attributes
	private int id;
	private String name;
	private int age;
	private String degree;
	
	//constructors
	public void professor()
	{ 
		
	}
	
	public void professor(int i, String n, int a, String d){
		this.id = i;
		this.name = n;
		this.age = a;
		this.degree = d;
	}
	
	
	
	//getters and setters
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	

}
