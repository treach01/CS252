package lecture2_27;

public class Student {
	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object aPerson)
	{ if(aPerson == null) 
		{return false;}
//	if(!aPerson instanceof Student) {return false;} //applies only to subclasses
	Student p = (Student)aPerson;
	boolean isEqual = this.name.equals(p.name);
	return isEqual; }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
