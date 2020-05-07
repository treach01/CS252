package hospitalsystem;

import java.util.ArrayList; 

public class Doctor implements PrescriptionOrder, ChartUpdate {
	public String name;
	public Wing wingassign;
	public String porders;
	
	
	//constructors
	public Doctor() {
		
	}
	
	public Doctor(String n) {
		this.name = n;
		
	}
	
	
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wing getWingassign() {
		return wingassign;
	}

	public void setWingassign(Wing wingassign) {
		this.wingassign = wingassign;
	}

	public String getPorders() {
		return porders;
	}

	public void setPorders(String porders) {
		this.porders = porders;
	}

	@Override
	public void orderPrescription(String presc, float price, Patient p) {
		p.setPatientbill(price + p.getPatientbill());
		
	}

	@Override
	public void chart(Patient p, String data) {
		String origdata = p.getMedinfo();
		p.setMedinfo(data + origdata);
	}
	
	
	
	
}
