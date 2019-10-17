import java.util.ArrayList;
import java.util.Arrays;

public class Start {
	
	//links for view object
	static CView cv = new CView();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cv.print("Welcome, this will help identify if people\n"
				+ "interested in the gospel");
		
	String reply = null;
	
	while (reply == null) {
		reply = cv.getAnswer("Let's start? (Y/N) ");
		
		if (reply.toUpperCase().contentEquals("Y")) {
			display();
		}
		else if (reply.toUpperCase().contentEquals("N")) {
			cv.print("\n Pray, Ponder, & come back later.");
			
		}
		
		else { 
			cv.print("\nTry again with a 'Y' or 'N'");
			reply = null;
		}
		
	  }
	
	}
	
	public static void display() {
		person[] personArray = {
				new person("Pam"),
				new person("Lose"),
				new person("Bet")
		};
		
		interest HaywardArea = 
				new interest("HaywardArea",
						new ArrayList<person>(Arrays.asList(personArray)));
		cv.print(HaywardArea.list());
		}
	}
	
	

