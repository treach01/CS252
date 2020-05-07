package hospitalsystem;

import java.util.ArrayList;

public class Specialist extends Doctor implements Surgery{
	public String speciality;
	
	//constructors
	public Specialist() {
	}

	public Specialist(String name, String wingassign, ArrayList<String> pord, String special) {
		super.name = name;
		super.wingassign = wingassign;
		super.porders = pord;
		this.speciality = special;
	}
	
	//getters and setters
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public void performMedProced(Procedure m, Patient p) {
		String origdata = p.getMedinfo();
		p.setMedinfo(origdata + m.getName());
		float totalbill = p.getPatientbill();
		p.setPatientbill(totalbill + m.getCost());
	}
	
	

}
