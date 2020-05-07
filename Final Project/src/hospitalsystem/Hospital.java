package hospitalsystem;

import java.util.ArrayList;

public class Hospital implements Patientlist<Patient> {
	public ArrayList<Wing> wings;
	public String address;
	public String name;
	public ArrayList<Patient> patientlist;
	
	public Hospital() {
		
	}
	
	public Hospital(String n, String add) {
		this.address = add;
		this.name = n;
	}
	
	public ArrayList<Wing> getWings() {
		return wings;
	}
	public void setWings(ArrayList<Wing> wings) {
		this.wings = wings;
	}

	public ArrayList<Patient> getPatientlist() {
		return patientlist;
	}

	public void setPatientlist(ArrayList<Patient> patientlist) {
		this.patientlist = patientlist;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void addPatient(Patient patient) {
			patientlist.add(patient);
	}
	
	public void removePatient(Patient patient) {
		patientlist.remove(patient);
	}
	
	public void assignNurse(Nurse n, Wing w) {
		if (w.nursetotal/w.capacity > 0.20) {
			System.out.println("Be advised: Nurse/patient ratio above recommended level"); //rec. level of nurses is one for 5 patients
			ArrayList<Nurse> currentnurses = w.getNurses();
			currentnurses.add(n);
			w.setNurses(currentnurses);
		}
		else {
			ArrayList<Nurse> currentnurses = w.getNurses();
			currentnurses.add(n);
			w.setNurses(currentnurses);
		}
	}

}
