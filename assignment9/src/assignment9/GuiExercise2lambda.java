package assignment9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GuiExercise2lambda {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JTextField tf1; JTextField tf2; JButton b1; JButton b2;
		JLabel l1; JLabel l2;
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
		b1.addActionListener((ActionEvent e) -> {
				if(e.getSource() == b1)
				{String txt = tf1.getText();
				l1.setText(txt); }
				else {
					String txt = tf2.getText();
					l2.setText(txt);
				};
		b2.addActionListener((ActionEvent g) -> {
			if(g.getSource() == b1)
			{String txt = tf1.getText();
			l1.setText(txt); }
			else {
				String txt = tf2.getText();
				l2.setText(txt);
			};
		f.add(b1); f.add(b2); f.add(tf1); f.add(tf2); f.add(l1); f.add(l2);
		f.setSize(400, 400);
		f.setVisible(true);
	}
	}
}
