package assignment9;

import java.awt.event.*;

import javax.swing.*;


public class GuiExercise9 {
	JFrame f; JButton showbutt; JLabel sl;
	GuiExercise9() {
		f = new JFrame("Ex_9");
		showbutt = new JButton("Show");
		showbutt.setBounds(300, 200, 150, 20);
		sl = new JLabel();
		final JComboBox combo = new JComboBox();
		combo.addItem("--Select--");
        combo.addItem("Java");
		   combo.addItem("C/C++");
		   combo.addItem(".NET");
		   combo.addItem("Perl");
		combo.setBounds(100, 200, 150, 20);
		final DefaultListModel<String> l1 = new DefaultListModel<>();  
        l1.addElement("Turbo C++");  
        l1.addElement("Struts");  
        l1.addElement("Spring");  
        l1.addElement("Yll");  
        final JList<String> list1 = new JList<>(l1);  
        list1.setBounds(100,100, 75,75);  
        f.add(list1);
		f.add(combo); f.add(showbutt); f.add(sl);
		showbutt.addActionListener((ActionEvent e) -> {  
               String lang = "";
               String frme = "";  
               if(combo.getSelectedItem().toString() != null) {
            	   lang = combo.getSelectedItem().toString();
               }
               if (list1.getSelectedIndex() != -1) {                       
                  frme = list1.getSelectedValue();    
               }  
               sl.setText("Programming Language Selected is:" + lang + "Framework selected" + frme);
            } );   
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
	}
	
	
	public static void main(String[] args) {
		new GuiExercise9();
	}
	
}