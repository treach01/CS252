package exersizes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exersize_2 extends Frame implements ActionListener{
		JTextField tf1; JTextField tf2; JButton b1; JButton b2;
		JLabel l1; JLabel l2;
		Exersize_2() {
			tf1 = new JTextField();
			tf1.setBounds(50, 100, 75, 20);
			
			tf2 = new JTextField();
			tf2.setBounds(200, 100, 75, 20);
			b1 = new JButton("Show Name");
			b1.setBounds(50, 150, 125, 20);
			b2 = new JButton("Show ID");
			b2.setBounds(200, 150, 125, 20);
			l1 = new JLabel("Name");
			l1.setBounds(50, 50, 75, 20);
			l2 = new JLabel("ID");
			l2.setBounds(200, 50, 75, 20);
			b1.addActionListener(this);
			b2.addActionListener(this);
			add(b1); add(b2); add(tf1); add(tf2); add(l1); add(l2);
			setSize(400, 400);
			setVisible(true);
			setLayout(false);
		}
		
		private void setLayout(boolean b) {
			// TODO Auto-generated method stub
			
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1)
			{String txt = tf1.getText();
			l1.setText(txt); }
			else {
				String txt = tf2.getText();
				l2.setText(txt);
			}
		}

		public static void main(String[] args) {
			new Exersize_2();
		}
		
}
