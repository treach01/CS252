package exersizes;

import java.awt.event.*;
import javax.swing.*;

public class Exersize_1 {
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Ex_1");
		final JTextField tf = new JTextField();
		tf.setBounds(50, 50, 95, 30);
		JButton b1 = new JButton("Submit");
		JButton b2 = new JButton("Reset");
		b1.setBounds(50, 100, 95, 30);
		b2.setBounds(50, 150, 95, 30);
		b1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(null, "Info Submitted Successfully", "Success", 1);
					} 
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tf.setText("");
			}
		});
		f.add(b1);
		f.add(b2);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
					
		
	}
}
