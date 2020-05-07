package hospitalsystem;

public class Patient {
	public String name;
	public String medinfo;
	public String wingStay;
	public float patientbill;
	
	//constructors
	public Patient() {
		
	}
	
	public Patient(String name, String med) {
		this.name = name;
		this.medinfo = med;
	}
	
	
	//getters and setters
	public String getMedinfo() {
		return medinfo;
	}
	public void setMedinfo(String medinfo) {
		this.medinfo = medinfo;
	}
	public float getPatientbill() {
		return patientbill;
	}
	public void setPatientbill(float patientbill) {
		this.patientbill = patientbill;
	}

	public String getWingStay() {
		return wingStay;
	}

	public void setWingStay(String wingStay) {
		this.wingStay = wingStay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
