package exersizes;

import java.awt.event.*;  
import javax.swing.*;    

public class Main_2 
	{  
		public static void main(String[] args) 
		{  
		    JFrame f=new JFrame("Button Example");  
		    final JTextField tf=new JTextField();  
		    tf.setBounds(50,50, 150,20);  
		    JButton b=new JButton("Click Here");  
		    b.setBounds(50,100,95,30);  
		    b.addActionListener(new ActionListener(){  
		    											public void actionPerformed(ActionEvent e)
		    											{  
		    												tf.setText("Welcome to OOP.");  
		    											}  
		    										});  
//		    JButton b2 = new JButton("Don't click me!");
//		    b2.addActionListener((ActionEvent e) -> {
//		    	tf.setText("Whyd you click tho");
//		    });
//		    b2.setBounds(200,100,95,30);
//		    f.add(b2);
		    f.add(b);f.add(tf);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);   
		    
		}    
	}


