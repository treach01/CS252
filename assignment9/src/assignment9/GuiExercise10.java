package assignment9;

import java.awt.event.*;

import javax.swing.*;

public class GuiExercise10 {
	JFrame f; JMenu menu; JMenu help; JMenu file; JMenu edit;
	JMenuItem copy; JMenuItem cut; JMenuItem paste; JMenuItem selectall;
	GuiExercise10() {
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
		copy.addActionListener((ActionEvent arg0) -> {
				JOptionPane.showMessageDialog(null,"copy is selected"); });
		cut.addActionListener((ActionEvent arg0) -> {
			JOptionPane.showMessageDialog(null,"cut is selected"); });
		paste.addActionListener((ActionEvent arg0) -> {
			JOptionPane.showMessageDialog(null,"paste is selected"); });
		selectall.addActionListener((ActionEvent arg0) -> {
			JOptionPane.showMessageDialog(null,"select all is selected"); });
		mainMen.add(file);
		mainMen.add(edit);
		mainMen.add(help);
		f.setJMenuBar(mainMen);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
	}
	
	public static void main(String[] args) {
		new GuiExercise10();
	}

}
