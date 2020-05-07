package assignment9;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class GuiExercise7 {
	JLabel pl; JLabel bl; JLabel tl; JLabel ml;
	JCheckBox pb; JCheckBox bp; JCheckBox tp;
	JButton orderbutt;
	GuiExercise7()
	{	JFrame f = new JFrame("Ex_7");
		ml = new JLabel("Food Ordering System");
		pl = new JLabel("Pizza @ 100");
		bl = new JLabel("Burger @ 30");
		tl = new JLabel("Tea @ 10");
		orderbutt = new JButton("Order");
		pb = new JCheckBox();
		bp = new JCheckBox();
		tp = new JCheckBox();
		ml.setBounds(50, 50, 300, 20);
		pl.setBounds(100, 200, 150, 20);
		pb.setBounds(300, 200, 50, 50);
		bl.setBounds(100, 250, 150, 20);
		bp.setBounds(300, 250, 50, 50);
		tl.setBounds(100, 300, 150, 20);
		tp.setBounds(300, 300, 50, 50);
		orderbutt.setBounds(100, 350, 150, 20);
		orderbutt.addActionListener((ActionEvent e) -> {
			if (pb.isSelected()) {
				JOptionPane.showMessageDialog(null, "Pizza:100");
			}
			else if(bp.isSelected()) {
				JOptionPane.showMessageDialog(null, "Burger:30");	
			}
			else if(tp.isSelected()) {
				JOptionPane.showMessageDialog(null, "Tea:10");
		} });
		f.add(ml); f.add(pl); f.add(bl); f.add(tl);
		f.add(pb); f.add(bp); f.add(tp);
		f.add(orderbutt);
		f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);
	}
	public static void main(String[] args) {
		new GuiExercise7();
	}


}




