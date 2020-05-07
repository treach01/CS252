package hospitalsystem;

import java.util.ArrayList;

public class Wing implements Patientlist<Patient>{
	public String name;
	public int capacity;
	public ArrayList<Nurse> nurses;
	public ArrayList<Doctor> doctors;
	public ArrayList<Patient> patient;
	public int nursetotal;

	//constructors
	public Wing() {
		
	}
	
	public Wing(String n, int cap) {
		this.name = n;
		this.capacity = cap;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public ArrayList<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(ArrayList<Nurse> nurses) {
		this.nurses = nurses;
		this.nursetotal = this.nurses.size() ;
	}


	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}


	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<Patient> getPatient() {
		return patient;
	}

	public void setPatient(ArrayList<Patient> patient) {
		this.patient = patient;
	}

	public void addPatient(Patient patient) {
		if(this.capacity > 0 ) {
		 this.capacity -= 1; }
		else {
			System.out.println("Unable to add patient, not enough space"); 
		}
	}
}
