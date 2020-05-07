package hospitalsystem;

public class Nurse implements ChartUpdate, RequestPrescription {
	 public String name;
	 public Wing wing;
	 public String shift;
	 
	 //constructors
	 public Nurse() {
	 }
	 
	 public Nurse(String name,  String shift) {
		 this.name = name;
		 this.shift = shift;
	 }
	 
	
	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wing getWing() {
		return wing;
	}
	public void setWing(Wing wing) {
		this.wing = wing;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public void chart(Patient p, String data) {
		String origdata = p.getMedinfo();
		p.setMedinfo(data + origdata);
		
	}

	@Override
	public String requestDrugs(String p, Doctor d) {
		
		return null;
	}
	 
	 
	 
}
