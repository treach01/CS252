package exersizes;

import java.awt.event.*;
import javax.swing.*;

public class Exersize_10 implements ActionListener {
	JFrame f; JMenu menu; JMenu help; JMenu file; JMenu edit;
	JMenuItem copy; JMenuItem cut; JMenuItem paste; JMenuItem selectall;
	Exersize_10() {
		f = new JFrame("Ex_10");
		JMenuBar mainMen = new JMenuBar();
		menu = new JMenu("Menu");
		help = new JMenu("Help");
		file = new JMenu("File");
		edit = new JMenu("Edit");
		copy = new JMenuItem("Copy");
		cut = new JMenuItem("Cut");
		paste = new JMenuItem("Paste");
		selectall = new JMenuItem("SelectAll");
		edit.add(cut); edit.add(copy); edit.add(paste); edit.add(selectall);
//		menu.add(file); menu.add(edit); menu.add(help);
		copy.addActionListener(this);
		cut.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		mainMen.add(file);
		mainMen.add(edit);
		mainMen.add(help);
		f.setJMenuBar(mainMen);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == copy) {
			JOptionPane.showMessageDialog(null,"copy is selected");
		}if(arg0.getSource() == cut) {
			JOptionPane.showMessageDialog(null,"cut is selected");
		}
		if(arg0.getSource() == paste) {
			JOptionPane.showMessageDialog(null,"copy is selected");
		}
		if(arg0.getSource() == selectall) {
			JOptionPane.showMessageDialog(null,"selectAll is selected");
		}
	
	}
	
	public static void main(String[] args) {
		new Exersize_10();
	}
	
	
}
