
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Layout extends JFrame{

	public Layout(){
		
		JPanel panel1 = new JPanel(new GridLayout(1,4));
		JPanel panel2 = new JPanel(new FlowLayout());
		
		panel1.add(new JLabel());
		panel1.add(new JLabel());
		panel1.add(new JLabel());
		panel2.add(new JButton("Refresh"));
		
		panel2.add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
	}
	
}
