package hospitalsystem;

import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.event.*;

public class MainScreen {
	
	
	//action listeners
	//adminacts
	checkin.addActionListener((ActionEvent arg0) -> {
		JOptionPane checkpanl = new JOptionPane();
		
		//name entry for patient
		JLabel name = new JLabel("Enter patients name");
		name.setBounds(100, 700, 150, 100);
		JTextField nfield = new JTextField();
		nfield.setBounds(100, 600, 200, 100);
		
		//medical information
		JLabel med = new JLabel("Enter patients medical information and admit date");
		med.setBounds(100, 500, 150, 100);
		JTextArea medentry = new JTextArea();
		medentry.setBounds(100, 400, 200, 200);
		
		//wing
		JLabel wing = new JLabel("Select wing");
		wing.setBounds(100, 200, 150, 100);
		final DefaultListModel<String> l1 = new DefaultListModel<>();  
        l1.addElement("ICU");  
        l1.addElement("ER");  
        l1.addElement("Oncology");  
        l1.addElement("General");  
        final JList<String> list1 = new JList<>(l1);  
        list1.setBounds(100, 100, 75, 75);  
		
        //submit button
        JButton submit = new JButton("Submit");
        submit.setBounds(500, 150, 150, 100);
		
        //add all to panel
        checkpanl.add(name); checkpanl.add(nfield);
        checkpanl.add(med); checkpanl.add(medentry);
        checkpanl.add(wing); checkpanl.add(list1);
        checkpanl.add(submit);
        
        //panel setting
        checkpanl.setVisible(true);
        checkpanl.setLayout(null);
        checkpanl.setSize(800, 800);
        
	});

}
