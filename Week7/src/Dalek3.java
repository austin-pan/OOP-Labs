import java.util.Random;
import java.util.ArrayList;

public class Dalek3 {
	private ArrayList<String> sayings;
	private Random r = new Random();
	
	public void setSayings(String[] s) {
		sayings = new ArrayList<String>();
		
		for(int i = 0; i < s.length; i++)
			this.addSaying(s[i]);
	}
	
	public void addSaying(String s) {
		if(sayings == null) {
			sayings = new ArrayList<String>();
		}
		sayings.add(s);
	}
	
	public void speak() {
		if(sayings != null)
			System.out.println(sayings.get(r.nextInt(sayings.size())));
		else
			System.out.println("No utterances installed!");
	}
	
	public static void main(String[] args) {

	    Dalek2 d1 = new Dalek2();
	    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek2 d2 = new Dalek2();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}
}
