package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		
		   
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageInt = Integer.parseInt(age);          
	if (ageInt >=(18))   {
		JOptionPane.showInputDialog(null, "Who do you want to be president?");
			} 
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
