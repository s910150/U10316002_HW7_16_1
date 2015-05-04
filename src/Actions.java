import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Actions extends JFrame{
	
	private JButton jbtRefreshButton = new JButton ("Refresh");
	private JLabel lable1 = new JLabel();
	private JLabel lable2 = new JLabel();
	private JLabel lable3 = new JLabel();
	private JLabel lable4 = new JLabel();
	private JPanel panel1 = new JPanel(new GridLayout(1,4));
	private JPanel panel2 = new JPanel(new FlowLayout());
	
	public Actions(){
		
	
		
		panel1.add(lable1);
		panel1.add(lable2);
		panel1.add(lable3);
		panel1.add(lable4);
			
		panel2.add(jbtRefreshButton);
		
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		
		jbtRefreshButton.addActionListener(new ButtonListener());
	}
	
	
	private class ButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			 int[] deck = new int[52];
			    
			
			    // Initialize cards 
			    for (int i = 0; i < deck.length; i++){
			      deck[i] = i+1;
			    }
			    
			    // Shuffle the cards
			    for (int i = 0; i < deck.length; i++) {
			      // Generate an index randomly
			      int index = (int)(Math.random() * deck.length);
			      int temp = deck[i];
			      deck[i] = deck[index]; 
			      deck[index] = temp;
			    }

			  
			    	
			    ImageIcon card1 = new ImageIcon("card/"+deck[1]+".png");
			    ImageIcon card2 = new ImageIcon("card/"+deck[2]+".png");
			    ImageIcon card3 = new ImageIcon("card/"+deck[3]+".png");
			    ImageIcon card4 = new ImageIcon("card/"+deck[4]+".png");
			    	
			    lable1.setIcon(card1);
			    lable2.setIcon(card2);
			    lable3.setIcon(card3);
			    lable4.setIcon(card4);
			    
		}
		
	}
	
	
}
