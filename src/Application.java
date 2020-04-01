/**
 * Application Class Programming Project 3 CS131
 * This class is to test all constructors/methods/getters and setters/ and toString for the objects
 * @author dalec
 *Version 1
 *Spring 2020
 *3/31/20
 */
public class Application{


	public static void main(String[] args) {

		Location location = new Location(5,5);
		
		System.out.println("**********************************************"+"\n\t\t Animal Tests"+
		"\n**********************************************");
		//Testing an empty animal
		Animal Goldfinch1 = new Goldfinch();
		//Getters and setters for simID
		Goldfinch1.setSimID(6);
		System.out.println("The SimID of Goldfinch 1 is "+ Goldfinch1.getSimID());
		//Getters and setters for location
		Goldfinch1.setLocation(location);
		System.out.println("The Location of Goldfinch1 is "+ Goldfinch1.getLocation());
		//Getters and setters for rested
		Goldfinch1.setRested(true);
		System.out.println("Is Goldfinch1 rested= "+ Goldfinch1.isRested());
		//Getters and setters for full
		Goldfinch1.setFull(false);
		System.out.println("Is Goldfinch1 full= "+ Goldfinch1.isFull());
		//Method Testing
		System.out.println("Goldfinch1 just ate is it full? "+ Goldfinch1.eat());
		System.out.println("Goldfinch1 just slept is it rested? "+ Goldfinch1.sleep());
		//Exception Testing
		Goldfinch1.setSimID(-3);
		System.out.println("The SimID of Goldfinch1 is " + Goldfinch1.getSimID());
		
		System.out.println("**********************************************"+"\n\t\t Location Tests"+
		"\n**********************************************");
		
		Location first = new Location();
		first.setxCoord(3);
		first.setyCoord(7);
		
		System.out.println("The xCoord of first is " + first.getxCoord());
		System.out.println("THe yCoord of first is " + first.getyCoord());
		
		
		System.out.println("**********************************************"+"\n\t\t GoldFinch Tests"+
		"\n**********************************************");

		Goldfinch bob = new Goldfinch();
		//Getters and Setters for wingspan
		bob.setWingSpan(7.4);
		System.out.println("Bob's WingSpan is "+ bob.getWingSpan());
		
		//Testing Exception
		bob.setWingSpan(14);
		System.out.println("Bob's WingSpan is "+ bob.getWingSpan());
		
		//Testing interfaces
		//bob.walk(direction);
		
		
		
		System.out.println("**********************************************"+"\n\t\t BrownBear Tests"+
		"\n**********************************************");
		
		BrownBear carl = new BrownBear();
		//Testing Getters and setters
		carl.setSubSpecies("Grizzly");
		System.out.println("Carl's subSpeices is "+ carl.getSubSpecies());
		
		//Testing exception
		carl.setSubSpecies("North American");
		System.out.println("Carl's subSpeices is "+ carl.getSubSpecies());
		
		//Testing interfaces
	
		
	}//End main
}//End Class Application
