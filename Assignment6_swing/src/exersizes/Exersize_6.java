package exersizes;

import javax.swing.*;
import java.awt.event.*;

public class Exersize_6 implements ActionListener {
		JLabel pl; JLabel bl; JLabel tl; JLabel ml;
		JRadioButton pb; JRadioButton bp; JRadioButton tp;
		JButton orderbutt;
		Exersize_6()
		{	JFrame f = new JFrame("Ex_6");
			ml = new JLabel("Food Ordering System");
			pl = new JLabel("Pizza @ 100");
			bl = new JLabel("Burger @ 30");
			tl = new JLabel("Tea @ 10");
			orderbutt = new JButton("Order");
			pb = new JRadioButton();
			bp = new JRadioButton();
			tp = new JRadioButton();
			ml.setBounds(50, 50, 300, 20);
			pl.setBounds(100, 200, 150, 20);
			pb.setBounds(300, 200, 50, 50);
			bl.setBounds(100, 250, 150, 20);
			bp.setBounds(300, 250, 50, 50);
			tl.setBounds(100, 300, 150, 20);
			tp.setBounds(300, 300, 50, 50);
			ButtonGroup bg = new ButtonGroup();
			bg.add(pb); bg.add(bp); bg.add(tp);
			orderbutt.setBounds(100, 350, 150, 20);
			orderbutt.addActionListener(this);
			f.add(ml); f.add(pl); f.add(bl); f.add(tl);
			f.add(pb); f.add(bp); f.add(tp);
			f.add(orderbutt);
			f.setSize(500,500);  
	        f.setLayout(null);  
	        f.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Pizza:100 \n Burger:30 \n Tea:10 \n" +"------------" + " \n Total:140.0");
		
		}
		
		public static void main(String[] args) {
			new Exersize_6();
		}

}
