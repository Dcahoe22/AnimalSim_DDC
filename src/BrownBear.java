/**
 * BrownBear Class Programming Project 3 CS131
 * This class is subclass of animal, it implements 2 interfaces called walkable and swimmable, the class instantiates a Brownbear object 
 * @author dalec
 *AnimalSim Project
 *Version 1
 *Spring 2020
 *3/31/20
 */
public class BrownBear extends Animal implements Walkable, Swimmable {
	
	//Instance variable
	private String subSpecies;
	
	public BrownBear() {
		simID= 0;
		Location l = new Location(0,0);
		full= false;
		rested = true;
		subSpecies = "Alaskan";
	}//End Empty Argument Constructor
	
	public BrownBear(int simID, Location l, String subSpecies) {
		this.simID = simID;
		this.location = l;
		this.subSpecies = subSpecies;
		this.full = false;
		this.rested = true;
	}//End Preferred Constructor
	
	/**
	 * Species method
	 * this method implements the InvalidSubspeciesException, the exception is thrown is the species of bear is not one of the
	 * 6 species listed in the try statement
	 */
	public void species() {
		InvalidSubspeciesException ise = new InvalidSubspeciesException("Invalid Species");
	try {
		if(subSpecies != "Alaskan, Asiatic, European, Grizzly, Kodiak, Siberian")
			throw ise;
	}catch (InvalidSubspeciesException s) {
		System.out.println(s.getMessage());
		}
	}//End Species method
	
//Getters and Setters	
	public String getSubSpecies() {
		return subSpecies;
	}//End getter SubSpecies

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//End setter SubSpecies
	
//Interfaces
	/**
	 * Walkable interface
	 * this interface changes the direction for the Bear by 3 units in any direction
	 */
	@Override
	public void walk(int direction) {
		Location l;
		int r = direction;
		if(direction > 3) {
			r= 3;
		}
		l = new Location(r, r);
		System.out.println("The Brown Bear Walked from "+ location.getCoordinates());
		location.update(l.getxCoord()+ location.getxCoord(), l.getyCoord()+ location.getyCoord());
		System.out.println("To "+ location.getCoordinates());
		
	}//End walk interface

	/**
	 * Swimmable interface
	 * this interface moves the bear 2 units in any direction when swimming
	 */
	@Override
	public void swim(int direction) {
		Location l;
		int d = direction;
		if(direction > 2) {
			d = 2;
		}
		l = new Location (d, d);
		System.out.println("The Brown Bear swam from "+ location.getCoordinates());
		location.update(l.getxCoord()+ location.getxCoord(), l.getyCoord()+ location.getxCoord());
		System.out.println("To "+ location.getCoordinates());
	}//End swim interface
}//End Class BrownBear
