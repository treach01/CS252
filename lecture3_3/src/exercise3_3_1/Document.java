package exercise3_3_1;

public abstract class Document {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String display() {
		return name;
		
	}
	

}
