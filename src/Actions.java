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
	
	//new objects to use
	private JButton jbtRefreshButton = new JButton ("Refresh");
	private JLabel label1 = new JLabel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel();
	private JPanel panel1 = new JPanel(new GridLayout(1,4));
	private JPanel panel2 = new JPanel(new FlowLayout());
	
	//constructor of Actions
	public Actions(){
		
	
		//add 4 labels on panel1
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		panel1.add(label4);
			
		//add 1 button(fresh) on panel2
		panel2.add(jbtRefreshButton);
		
		//add panel1 and panel2 to frame
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		
		//call the addActionListener() to execute the button action
		jbtRefreshButton.addActionListener(new ButtonListener());
	}
	
	
	private class ButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			//declare an array to store the card 
			 int[] deck = new int[52];
			    
			
			    // Initialize cards to 0
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

			  
			    //new 4 imageIcon to store the 4 shuffled cards 
			    ImageIcon card1 = new ImageIcon("card/"+deck[1]+".png");
			    ImageIcon card2 = new ImageIcon("card/"+deck[2]+".png");
			    ImageIcon card3 = new ImageIcon("card/"+deck[3]+".png");
			    ImageIcon card4 = new ImageIcon("card/"+deck[4]+".png");
			    	
			    //put the 4 imageIcon to the 4 labels
			    label1.setIcon(card1);
			    label2.setIcon(card2);
			    label3.setIcon(card3);
			    label4.setIcon(card4);
			    
		}
		
	}
	
	
}
