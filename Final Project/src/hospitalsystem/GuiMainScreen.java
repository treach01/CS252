package hospitalsystem;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GuiMainScreen {
	Hospital mercy = new Hospital("Mercy Hospital","1692 Hennepin Ave Minneapolis");
	
	// create structure of hospital, 
	// with wings and capacity levels
	
	ArrayList<Wing> mercyWings = new ArrayList<Wing>(); 		
	Wing intcare = new Wing("ICU", 100);				
	Wing emergency = new Wing("ER", 30);
	Wing oncol = new Wing("Oncology", 60);
	Wing matward = new Wing("OB/GYN", 60);
	
	//creates staff for purposes of operating UI
	Doctor jennings = new Doctor("Derek Jennings");
	Doctor gray = new Doctor("Sarah Gray");
	Doctor harold = new Doctor("Jeff Harold");
	Doctor Kaplan = new Doctor("Jessica Kaplan");
	//nurse staff
	Nurse amellia = new Nurse("John Amelia", "Night");
	Nurse helga = new Nurse("Genna Helga", "Day");
	Nurse mae = new Nurse("Mae Werfert", "Night");
	Nurse jake = new Nurse("Jake Wyman", "Day"); 

	//add patients
	ArrayList<Patient> patientlist = new ArrayList<Patient>();
	Patient jimmy = new Patient("Jimmy Johns", "Allergic to gluten, Mauled by lions");
	Patient John = new Patient("Alana John", "Hit by truck, glass lacerations");
	Patient Sarah = new Patient("Sarah connor", "troubled past, encounter with killer robot");
	
	
	//create GUI
	//start by creating menu block which will serve as primary navigation in the app
	//then build out actions which add items to the frame as methods require
	JFrame hospframe;
	JMenu hospital; //Admin Actions
	JMenu nurse; //Nurse Actions
	JMenu doctor; //Doctor Actions
	
	JMenuItem checkout; //admin action
	JMenuItem checkin; //admin act
	JMenuItem view; //admin act
	
	JMenuItem surgery; // doctor 
	JMenuItem prescriptionrequest; //nurse
	JMenuItem prescriptionorder; //doctor
	JMenuItem dchart; //doctor
	JMenuItem nchart;
	
	GuiMainScreen() {
		//add data members for presentation purposes
		mercyWings.add(intcare);
		mercyWings.add(emergency);
		mercyWings.add(oncol); 
		mercyWings.add(matward);
		mercy.setWings(mercyWings);
		//add patients tolist and add list to hospital
		patientlist.add(John);
		patientlist.add(Sarah);
		patientlist.add(jimmy);
		mercy.setPatientlist(patientlist);
		//add doctors to wings
		ArrayList<Doctor> erdocs = new ArrayList<Doctor>();
		erdocs.add(jennings);
		emergency.setDoctors(erdocs);
		
		ArrayList<Doctor> icdocs = new ArrayList<Doctor>();
		icdocs.add(Kaplan);
		intcare.setDoctors(icdocs);
		
		ArrayList<Doctor> oncdocs = new ArrayList<Doctor>();
		oncdocs.add(gray);
		oncol.setDoctors(oncdocs);
		
		ArrayList<Doctor> matdocs = new ArrayList<Doctor>();
		matdocs.add(harold);
		matward.setDoctors(matdocs);
		
		//add to wings
		ArrayList<Patient> iculist = new ArrayList<Patient>();
		ArrayList<Patient> erlist = new ArrayList<Patient>();
		ArrayList<Patient> metwardlist = new ArrayList<Patient>();
		iculist.add(John);
		erlist.add(jimmy);
		metwardlist.add(Sarah);
		intcare.setPatient(iculist);
		emergency.setPatient(erlist);
		matward.setPatient(metwardlist);
		
		//creating elements for gui
		hospframe = new JFrame();
		JLabel welcome = new JLabel("Welcome to Mercy Hospital's Medical Care software!");
		welcome.setBounds(200, 300, 150, 100);
		JMenuBar mainmen =new JMenuBar();
		
		//three main menu tabs
		hospital = new JMenu("Hospital");
		nurse = new JMenu("Nurse");
		doctor = new JMenu("Doctor");
		
		//admin acts
		checkout = new JMenuItem("Check out Patient");
		checkin = new JMenuItem("Check in Patient");
		view = new JMenuItem("See list of Patients");
		
		//doctor/nurse actions
		prescriptionorder = new JMenuItem("Order Prescription");
		dchart = new JMenuItem("Update Medical Chart");
		nchart = new JMenuItem("Update Medical Chart");
		prescriptionrequest = new JMenuItem("Request Prescription");
		
		
		//add items to menu
		hospital.add(checkin); hospital.add(checkout); hospital.add(view);
		doctor.add(dchart); doctor.add(prescriptionorder);
		nurse.add(nchart); nurse.add(prescriptionrequest);
		
		//hospital action listeners
			//adminacts
			checkin.addActionListener((ActionEvent arg0) -> {
				
				
				//name entry for patient
				JLabel name = new JLabel("Enter patients name");
				name.setBounds(50, 100, 150, 50);
				JTextField nfield = new JTextField();
				nfield.setBounds(50, 150, 100, 25);
				
				//medical information
				JLabel med = new JLabel("Enter patients medical information");
				med.setBounds(50, 200, 350, 100);
				JTextArea medentry = new JTextArea();
				medentry.setBounds(50, 275, 150, 150);
				
				//wing
				JLabel wing = new JLabel("Select wing");
				wing.setBounds(50, 450, 150, 100);
				final JComboBox combo = new JComboBox();
				combo.addItem("--Select--");
		        combo.addItem("ICU");
				   combo.addItem("ER");
				   combo.addItem("Oncology");
				   combo.addItem("General");  
		        combo.setBounds(50, 550, 150, 50);  
				
		        //submit button
		        JButton submit = new JButton("Submit");
		        submit.setBounds(500, 150, 100, 50);
				
		      //clear and submit action listener
		        submit.addActionListener((ActionEvent arg1) -> {
		        	String Pname = nfield.getText();
		        	String Pmedinfo = medentry.getText();
		        	String Stringwing = combo.getSelectedItem().toString();
		        	Wing selwing = null;
		        	for (Wing c: mercyWings) {
		        		if(c.getName().equals(Stringwing)) {
		        			selwing = c;
		        		}
		        	} 
		        	ArrayList<Patient> origlist = mercy.getPatientlist();
		        	ArrayList<Patient> winglist = selwing.getPatient();
		        	winglist.add(new Patient(Pname, Pmedinfo));
		        	origlist.add(new Patient(Pname, Pmedinfo));
		        	mercy.setPatientlist(origlist);
		        	selwing.setPatient(winglist); 
		        	hospframe.remove(name); hospframe.remove(nfield); hospframe.remove(med);
		        	hospframe.remove(medentry); hospframe.remove(wing); hospframe.remove(combo);
		        	hospframe.remove(submit);
		        }  );
		        
		        
		        //add all to panel
		        hospframe.remove(welcome);
		        hospframe.add(name); hospframe.add(nfield);
		        hospframe.add(med); hospframe.add(medentry);
		        hospframe.add(wing); hospframe.add(combo);
		        hospframe.add(submit);
		       	        
			});
			
			//removes patient from list and calcs their bill
			checkout.addActionListener((ActionEvent arg0) -> { 
				//name entry for patient
				JLabel name = new JLabel("Enter patients name");
				name.setBounds(50, 100, 150, 50);
				JTextField nfield = new JTextField();
				nfield.setBounds(50, 150, 100, 25);
				
				//wing
				JLabel wing = new JLabel("Select wing");
				wing.setBounds(50, 200, 350, 100);
				final JComboBox combo = new JComboBox();
				combo.addItem("--Select--");
		        combo.addItem("ICU");
				   combo.addItem("ER");
				   combo.addItem("Oncology");
				   combo.addItem("General");  
		        combo.setBounds(50, 275, 150, 50);
				
		        //submit button
		        JButton submit = new JButton("Submit");
		        submit.setBounds(500, 150, 100, 50);
		        
		      //clear and submit action listener
		        submit.addActionListener((ActionEvent arg1) -> {
		        	String Pname = nfield.getText();
		        	String Stringwing = combo.getSelectedItem().toString();
		        	Wing selwing = null;
		        	for (Wing c: mercyWings) {
		        		if(c.getName().equals(Stringwing)) {
		        			selwing = c;
		        		}
		        	} 
		        	Patient selPatient = null;
		        	for(Patient e: mercy.patientlist ) {
		        		if(e.getName().equals(Pname)) {
		        			selPatient = e;
		        		}
		        	}
		        	Patient wingpatient = null;
		        	for(Patient g:selwing.getPatient()) {
		        		if(g.getName().equals(Pname)) {
		        			wingpatient = g;
		        		}
		        	}
		        	ArrayList<Patient> origlist = mercy.getPatientlist();
		        	ArrayList<Patient> winglist = selwing.getPatient();
		        	origlist.remove(selPatient);
		        	winglist.remove(wingpatient);
		        	mercy.setPatientlist(origlist);
		        	selwing.setPatient(winglist); 
		        	//Prompt user with bill of patient
		        	float totalbill = selPatient.getPatientbill();
		        	JOptionPane.showMessageDialog(null, "Patient's total is"+ String.valueOf(totalbill));
		        	
		        	
		        	hospframe.remove(name); hospframe.remove(nfield); 
		        	hospframe.remove(wing); hospframe.remove(combo);
		        	hospframe.remove(submit);
		        }  );
		      //add all to panel
		        hospframe.remove(welcome);
		        hospframe.add(name); hospframe.add(nfield);
		        hospframe.add(wing); hospframe.add(combo);
		        hospframe.add(submit);
		        
			});
			
			
			// allows admins to see list of all patients in the hospital
			view.addActionListener((ActionEvent arg0) -> {
				//name entry for patient
				JTextField list = new JTextField();
				String pList = "";
				String newline = "\n";
				for(Patient p:mercy.patientlist) {
					pList += p.getName() + newline +",";
				}
				list.setText(pList);
				list.setEditable(false);
				list.setBounds(50, 100, 400, 200);
				//clear button
				JButton submit = new JButton("Submit");
		        submit.setBounds(300, 300, 100, 50);
		        submit.addActionListener((ActionEvent arg1) -> {
		        	hospframe.remove(list);
		        	hospframe.remove(submit);
		        	
		        });
		        //add all to panel
		        hospframe.remove(welcome);
		        hospframe.add(list);
		        hospframe.add(submit);
			});
				
		//nurse action listeners
			nchart.addActionListener((ActionEvent arg0) -> {
				//name entry for patient
				JLabel name = new JLabel("Enter patients name");
				name.setBounds(50, 100, 150, 50);
				JTextField nfield = new JTextField();
				nfield.setBounds(50, 150, 100, 25);
				
				//find patient button
		        JButton find = new JButton("Find");
		        find.setBounds(500, 150, 100, 50);
				
		        find.addActionListener((ActionEvent arg2) -> {
		        	hospframe.remove(find);
		        	hospframe.remove(name);
		        	hospframe.remove(nfield);
		        	String pname = nfield.getText();
		        	String medinfo = "";
		        	for(Patient e:mercy.getPatientlist()) {
		        		if(e.getName().equals(pname)) {
		        			medinfo = e.getMedinfo();
		        		}
		        	}
		        	//patient name
		        	JLabel patlabel = new JLabel(pname);
		        	patlabel.setBounds(100, 100, 150, 50);
		        	//patient med info
		        	JTextArea medentry = new JTextArea(medinfo);
		        	medentry.setBounds(100, 175, 350, 150);
		        	//submit button
			        JButton submit = new JButton("Submit");
			        submit.setBounds(100, 400, 100, 50);	
			        //submit updated chart
			        submit.addActionListener((ActionEvent arg3) -> {
			        	String npat = patlabel.getText();
			        	Patient spat = null;
			        	for(Patient e:mercy.getPatientlist()) {
			        		if(e.getName().equals(npat)) {
			        			spat = e;
			        		}
			        	}
			        	String newmed = medentry.getText();
			        	spat.setMedinfo(newmed);
			        	hospframe.remove(patlabel); hospframe.remove(medentry);
			        	hospframe.remove(submit);
			        	
			        });
			        
		        	//add all to panel
			        hospframe.add(patlabel); hospframe.add(medentry);
			        hospframe.add(submit);
		        });
		        
		        
		        
		        // add to initial search frame
		        hospframe.remove(welcome);
		        hospframe.add(name); hospframe.add(nfield);
		        hospframe.add(find);
		        
			});
			
			
			//doctor charting
			dchart.addActionListener((ActionEvent arg2) -> {
				//name entry for patient
				JLabel name = new JLabel("Enter patients name");
				name.setBounds(50, 100, 150, 50);
				JTextField nfield = new JTextField();
				nfield.setBounds(50, 150, 100, 25);
				
				//find patient button
		        JButton find = new JButton("Find");
		        find.setBounds(500, 150, 100, 50);
				
		        find.addActionListener((ActionEvent arg5) -> {
		        	hospframe.remove(find);
		        	hospframe.remove(name);
		        	hospframe.remove(nfield);
		        	String pname = nfield.getText();
		        	String medinfo = "";
		        	for(Patient e:mercy.getPatientlist()) {
		        		if(e.getName().equals(pname)) {
		        			medinfo = e.getMedinfo();
		        		}
		        	}
		        	//patient name
		        	JLabel patlabel = new JLabel(pname);
		        	patlabel.setBounds(100, 100, 150, 50);
		        	//patient med info
		        	JTextArea medentry = new JTextArea(medinfo);
		        	medentry.setBounds(100, 175, 150, 150);
		        	//submit button
			        JButton submit = new JButton("Submit");
			        submit.setBounds(100, 400, 100, 50);	
			        //submit updated chart
			        submit.addActionListener((ActionEvent arg3) -> {
			        	String npat = patlabel.getText();
			        	Patient spat = null;
			        	for(Patient e:mercy.getPatientlist()) {
			        		if(e.getName().equals(npat)) {
			        			spat = e;
			        		}
			        	}
			        	String newmed = medentry.getText();
			        	spat.setMedinfo(newmed);
			        	hospframe.remove(patlabel); hospframe.remove(medentry);
			        	hospframe.remove(submit);
			        	
			        });
			        
		        	//add all to panel
			        hospframe.add(patlabel); hospframe.add(medentry);
			        hospframe.add(submit);
		        });
		        
		        
		        
		        // add to initial search frame
		        hospframe.remove(welcome);
		        hospframe.add(name); hospframe.add(nfield);
		        hospframe.add(find);
		        
			});
			
			//nurse prescription request to a doctor
			prescriptionrequest.addActionListener((ActionEvent arg6) -> {
				//wing
				JLabel wing = new JLabel("Select wing");
				wing.setBounds(50, 100, 350, 100);
				final JComboBox combo = new JComboBox();
				combo.addItem("--Select--");
		        combo.addItem("ICU");
				   combo.addItem("ER");
				   combo.addItem("Oncology");
				   combo.addItem("General");  
		        combo.setBounds(50, 175, 150, 50);
				
				
				//find patient button
		        JButton find = new JButton("Find");
		        find.setBounds(500, 175, 100, 50);
				
		        find.addActionListener((ActionEvent arg5) -> {
		        	hospframe.remove(combo);
		        	hospframe.remove(find);
		        	hospframe.remove(wing);
		        	Wing swig = null;
		        	for(Wing w:mercy.getWings()) {
		        		if(w.getName().equals(combo.getSelectedItem())) {
		        			swig = w;
		        		}
		        	}
		        	String wingName = swig.getName();
		        	//wing name
		        	JLabel wLabel = new JLabel(wingName);		
		        	wLabel.setBounds(300, 50, 150, 50);		
		        	//Presc info
		        	JLabel patlabel = new JLabel("Please Enter Prescription and name of patient");
		        	patlabel.setBounds(50, 100, 400, 50);
		        	//patient presc info
		        	JTextArea prescentry = new JTextArea();
		        	prescentry.setBounds(50, 175, 150, 150);
		        	//doctor name
		        	JLabel doclabel = new JLabel("Please Enter Doctor from wing");
		        	doclabel.setBounds(400, 100, 250, 50);
		        	//patient med info
		        	JTextField docfield = new JTextField();
		        	docfield.setBounds(400, 175, 150, 50);
		        	//submit button
			        JButton submit = new JButton("Submit");
			        submit.setBounds(100, 400, 100, 50);	
			        
		       
			        //submit updated chart
			        submit.addActionListener((ActionEvent arg3) -> {
			        	String ndoc = docfield.getText();
			        	String wnam = wLabel.getText();
			        	Doctor sdoc = null;
			        	Wing Swig = null;
			        	for(Wing w: mercy.getWings()) {
			        		if(w.getName().equals(wnam)) {
			        			Swig = w;
			        		}
			        	}
			        	for(Doctor e: Swig.getDoctors()) {
			        		if(e.getName().equals(ndoc)) {
			        			sdoc = e;
			        		}
			        	}
			        	//send presc to doctor
			        	String prescript = prescentry.getText();
			        	sdoc.setPorders(prescript);
			        	hospframe.remove(patlabel); hospframe.remove(doclabel);
			        	hospframe.remove(docfield); hospframe.remove(wLabel);
			        	hospframe.remove(submit); hospframe.remove(prescentry);
			      
			        });	
			       hospframe.add(docfield); hospframe.add(doclabel);
			       hospframe.add(patlabel); hospframe.add(prescentry);
			       hospframe.add(wLabel);
			       hospframe.add(submit);
		        });
		     hospframe.remove(welcome);   
		     hospframe.add(combo); hospframe.add(wing);
		     hospframe.add(find);
			});   
		       
			prescriptionorder.addActionListener((ActionEvent arg8) -> {
				//wing
				JLabel wing = new JLabel("Select wing");
				wing.setBounds(50, 100, 350, 100);
				final JComboBox combo = new JComboBox();
				combo.addItem("--Select--");
		        combo.addItem("ICU");
				   combo.addItem("ER");
				   combo.addItem("Oncology");
				   combo.addItem("General");  
		        combo.setBounds(50, 175, 150, 50);
		        
				//doctor name
	        	JLabel doclabel = new JLabel("Please Enter Doctor from wing");
	        	doclabel.setBounds(200, 100, 250, 50);
	        	//patient med info
	        	JTextField docfield = new JTextField();
	        	docfield.setBounds(200, 175, 150, 50);
	        	
				//find patient button
		        JButton find = new JButton("Find");
		        find.setBounds(500, 175, 100, 50);
				
				
		        find.addActionListener((ActionEvent arg5) -> { 
		        	String docname = docfield.getText();
		        	String wname = combo.getSelectedItem().toString();
		        	Wing selwing = null;
		        	Doctor seldoc = null;
		        	for(Wing w:mercy.getWings()) {
		        		if(w.getName().equals(wname)) {
		        			selwing = w;
		        		}
		        	}
		        	for(Doctor d:selwing.getDoctors()) {
		        		if(d.getName().equals(docname)) {
		        			seldoc = d;
		        		}
		        	}
		        	//doc label
		        	JLabel doc = new JLabel(docname);
		        	doc.setBounds(50, 50, 150, 25);
		        	
		        	JLabel win = new JLabel(wname);
		        	win.setBounds(200, 150, 100, 25);
		        	
		        	
		        	//presc label
					JLabel prescs = new JLabel("Pending Orders");
					prescs.setBounds(50, 100, 150, 50);
		        	//presc
					JTextArea pendpres = new JTextArea();
					String pend = seldoc.getPorders();
					pendpres.setText(pend);
					pendpres.setEditable(false);
					pendpres.setBounds(50, 150, 100, 100);
					//enter prescript and price
					JLabel pentry = new JLabel("Enter drug");
					pentry.setBounds(200, 200, 150, 50);
					
					JTextField drug = new JTextField();
					drug.setBounds(200, 275, 150, 50);
					
					JLabel priceLab = new JLabel("Enter Price");
					priceLab.setBounds(200, 325, 150, 50);;
					
					JTextField pricent = new JTextField();
					pricent.setBounds(200, 400, 150, 50);
					
					JLabel patnam = new JLabel("Enter Patient Name");
					patnam.setBounds(400, 100, 150, 50);
					
					JTextField entpat = new JTextField();
					entpat.setBounds(400, 150, 150, 50);
					
					//submit
					JButton submit = new JButton("Submit");
			        submit.setBounds(50, 400, 100, 50);
					
			        submit.addActionListener((ActionEvent r) -> {
			        	//remove prescription order from doctor list
			        	String doct = doc.getText();
			        	String winn = win.getText();
			        	Wing selewing = null;
			        	Doctor seledoc = null;
			        	for(Wing w:mercy.getWings()) {
			        		if(w.getName().equals(winn)) {
			        			selewing = w;
			        		}
			        	}
			        	for(Doctor d:selewing.getDoctors()) {
			        		if(d.getName().equals(doct)) {
			        			seledoc = d;
			        		}
			        	}
			        	seledoc.setPorders("");
			        	//add prescription to bill for patient
			        	String pname = entpat.getText();
			        	Patient chpat = null;
			        	for(Patient p:mercy.getPatientlist()) {
			        		if(p.getName().equals(pname)) {
			        			chpat = p;
			        		}
			        	}
			        	String price = pricent.getText();
			        	float currbill = chpat.getPatientbill();
			        	chpat.setPatientbill((Float.parseFloat(price) + currbill));
			        	hospframe.remove(prescs); hospframe.remove(pendpres);
			        	hospframe.remove(drug); hospframe.remove(pentry);
			        	hospframe.remove(priceLab); hospframe.remove(pricent);
			        	hospframe.remove(submit); hospframe.remove(doc);
			        	hospframe.remove(win); hospframe.remove(patnam);
			        	hospframe.remove(entpat);
			        });
			        
					hospframe.remove(doclabel); hospframe.remove(docfield);
		        	hospframe.remove(find); hospframe.remove(wing);
		        	hospframe.remove(combo);
		        	hospframe.add(prescs); hospframe.add(pendpres);
		        	hospframe.add(pentry); hospframe.add(drug);
		        	hospframe.add(priceLab); hospframe.add(pricent);
		        	hospframe.add(submit);
		        	hospframe.add(doc); hospframe.add(win);
		        	hospframe.add(patnam); hospframe.add(entpat);
		        	
		        });
				hospframe.remove(welcome);
				hospframe.add(docfield); hospframe.add(doclabel);
				hospframe.add(find); hospframe.add(combo);
				hospframe.add(wing);
				
			});
			
			        	
		
		mainmen.add(hospital);
		mainmen.add(nurse);
		mainmen.add(doctor);
		
		//put components onto frame
		hospframe.setJMenuBar(mainmen);
		hospframe.add(welcome);
		
		//frame specifications
		hospframe.setSize(800, 800);
		hospframe.setVisible(true);
		hospframe.setLayout(null);
		
	}
	
	
	public static void main(String[] args) {
		new GuiMainScreen();
	}
	
}
