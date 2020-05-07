package exersizes;

import java.awt.event.*;
import javax.swing.*;
 
public class Exersize_4 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Ex_4");
		final JTextField tf1 = new JTextField("");
		tf1.setEditable(false);
		tf1.setBounds(50, 100, 150, 20);
		JLabel l1 = new JLabel("Words");
		l1.setBounds(50, 50, 150, 20);
		JLabel l2 = new JLabel("Characters");
		l2.setBounds(200, 50, 150, 20);
		final JTextField tf2 = new JTextField("");
		tf2.setEditable(false);
		tf2.setBounds(200, 100, 150, 20);
		JButton b = new JButton("Count Words and Chars");
		b.setBounds(100, 250, 300, 20);
		final JTextArea ta = new JTextArea();
		ta.setBounds(50, 200, 300, 150);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = ta.getText();
				String words[] = text.split("\\s");
				tf1.setText("Words:"+ words.length);
				tf2.setText("Chars" + text.length());
			}
		});
		f.add(tf1); f.add(tf2); f.add(l1); f.add(l2);f.add(b);  f.add(ta); 
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
		
	}
}
