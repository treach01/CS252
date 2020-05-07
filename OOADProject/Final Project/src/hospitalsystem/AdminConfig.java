package hospitalsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminConfig {

	// in this code, I will create the basic structure of the hospital and create data
	// for a worker in the hospital to work with in the UI
		Hospital mercy = new Hospital("Mercy Hospital","1692 Hennepin Ave Minneapolis");
		
		// Lines 9 - 19 create structure of hospital, 
		// with wings and capacity levels
		
		ArrayList<Wing> mercyWings = new ArrayList<Wing>(); 		
		Wing intcare = new Wing("ICU", 100);				
		Wing emergency = new Wing("ER", 30);
		Wing oncol = new Wing("Oncology", 60);
		Wing matward = new Wing("OB/GYN", 60);
//		mercyWings.add(intcare);
//		mercyWings.add(emergency);
//		mercyWings.add(oncol); 
//		mercyWings.add(matward);
//		mercy.setWings(mercyWings);
		
		//creates staff for purposes of operating UI
		Doctor jennings = new Doctor("Derek Jennings");
		Doctor gray = new Doctor("Sarah Gray");
		Doctor harold = new Doctor("Jeff Harold");
		Doctor Kaplan = new Doctor("Jessica Kaplan");
		
		Nurse amellia = new Nurse("John Amelia", "Night");
		Nurse helga = new Nurse("Genna Helga", "Day");
		Nurse mae = new Nurse("Mae Werfert", "Night");
		Nurse jake = new Nurse("Jake Wyman", "Day"); 
		
		
		

}