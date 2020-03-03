package problem4;

public class Affiliation {
	private String instit;
	private String address;
	
	//constructors
	public Affiliation() {
		
	}
	
	public Affiliation(String inst, String add) {
		this.address = add;
		this.instit = inst;
	}
	
	
	//getters/setters
	public String getInstit() {
		return instit;
	}
	public void setInstit(String instit) {
		this.instit = instit;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
