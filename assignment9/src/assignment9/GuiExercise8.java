package assignment9;

import java.awt.event.*;

import javax.swing.*;

public class GuiExercise8 {
	JFrame f; JButton showbutt; JLabel sl;
	GuiExercise8() {
		f = new JFrame("Ex_8");
		showbutt = new JButton("Show");
		showbutt.setBounds(300, 200, 150, 20);
		sl = new JLabel();
		final JComboBox combo = new JComboBox();
		combo.addItem("--Select--");
        combo.addItem("Java");
		   combo.addItem("C/C++");
		   combo.addItem(".NET");
		   combo.addItem("Perl");
		combo.setBounds(100, 200, 150, 20);
		f.add(combo); f.add(showbutt); f.add(sl);
		showbutt.addActionListener((ActionEvent e) -> {  
                String lang = "";
                if(combo.getSelectedItem().toString() != null) {
             	   lang = combo.getSelectedItem().toString();
                }
                sl.setText("Programming Lang Selected:" + lang);
            }
            ); 
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);

}
	public static void main(String[] args) {
		new GuiExercise8();
	}
	
	
	
}
