package assignment9;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GuiExercise3 implements ActionListener {  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2,b3,b4;  
    GuiExercise3()
    {  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);  
        tf3.setEditable(false);   
        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50); 
        b3 = new JButton("*");
        b3.setBounds(50, 260, 50, 50);
        b4 = new JButton("/");
        b4.setBounds(120, 260, 50, 50);
        b1.addActionListener((ActionEvent e) ->  {
        		String s1=tf1.getText();  
        		String s2=tf2.getText();  
        		int a=Integer.parseInt(s1);  
        		int b=Integer.parseInt(s2);  
        		int c=0;
        		c=a+b;  
        		String result=String.valueOf(c);  
        	    tf3.setText(result); 
        	});
        b2.addActionListener((ActionEvent e) ->  {
    		String s1=tf1.getText();  
    		String s2=tf2.getText();  
    		int a=Integer.parseInt(s1);  
    		int b=Integer.parseInt(s2);  
    		int c=0;
    		c=a-b;  
    		String result=String.valueOf(c);  
    	    tf3.setText(result); 
    	});  
        b3.addActionListener((ActionEvent e) ->  {
    		String s1=tf1.getText();  
    		String s2=tf2.getText();  
    		int a=Integer.parseInt(s1);  
    		int b=Integer.parseInt(s2);  
    		int c=0;
    		c=a*b;  
    		String result=String.valueOf(c);  
    	    tf3.setText(result); 
    	});  
        b4.addActionListener((ActionEvent e) ->  {
    		String s1=tf1.getText();  
    		String s2=tf2.getText();  
    		int a=Integer.parseInt(s1);  
    		int b=Integer.parseInt(s2);  
    		int c=0;
    		c=a/b;  
    		String result=String.valueOf(c);  
    	    tf3.setText(result); 
    	});  
        
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);
        f.add(b3); f.add(b4);
        
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    
    public static void main(String[] args) 
    {  
    new GuiExercise3();  
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}  