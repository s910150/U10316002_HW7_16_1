import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.javafx.geom.AreaOp.AddOp;


public class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e){
		
		 int[] deck = new int[52];
		    
		    // Initialize cards 初始化--0
		    for (int i = 0; i < deck.length; i++){
		      deck[i] = i;
		    }
		    
		    // Shuffle the cards--洗牌
		    for (int i = 0; i < deck.length; i++) {
		      // Generate an index randomly
		      int index = (int)(Math.random() * deck.length);
		      int temp = deck[i];
		      deck[i] = deck[index]; 
		      deck[index] = temp;
		    }

		    for(int i = 0;i<4;i++){
		    	
		    	//deck[i]
		    	
		    }
		
		
	}
	
}
