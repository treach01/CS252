package assignment9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiExercise5 {
	public static void main(String[] args) 
    {    
    	JFrame f=new JFrame("Password Field Example");    
    	final JLabel label = new JLabel();            
    	label.setBounds(20,150, 200,50);  
    	final JPasswordField value = new JPasswordField();   
    	value.setBounds(100,75,100,30);   
    	JLabel l1=new JLabel("Username:");    
        l1.setBounds(20,20, 80,30);    
        JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,75, 80,30);    
        JButton b = new JButton("Login");  
        b.setBounds(100,120, 80,30);    
        final JTextField text = new JTextField();  
        text.setBounds(100,20, 100,30);    
        
        f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);  
        
        f.setSize(300,300);    
        f.setLayout(null);    
        f.setVisible(true);     
        
        b.addActionListener((ActionEvent e) ->
                					{ String user = text.getText();
                					  String psswd = new String(value.getPassword());
        							if(user.equals("Daniel")) {
        								  label.setText("Login Successful");
                						}
        							else {
        								label.setText(user + psswd);
        							}
        						});   
    }  
}