/**
 * Animal Class Programming Project 3 CS131
 * This class is the abstract super class, which creates an generic animal
 * @author dalec
 *AnimalSim Project
 *Version 1
 *Spring 2020
 *3/31/20
 */
import java.util.Random;

abstract public class Animal {
	
	//Instance variables
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	Random rand1 = new Random();//random number generator for animal being full
	Random rand2 = new Random();//random number generator for animal being rested
	
	public Animal() {
		simID = 0;
		Location l = new Location(0,0);
		full = false;
		rested = true;
	}//End Empty Argument Constructor
	
	public Animal(int simID, Location l) {
		this.simID = simID;
		this.location = l;
		this.full = false;
		this.rested = true;
	}//End Preferred Constructor
	
	/**
	 * Eat method
	 * this method uses a random number generator for if the animal is full
	 * @return
	 */
	public boolean eat() {
		double a = rand1.nextDouble();
		if(a <= 0.5)
			return false;
		return true;
	}//End Eat method
	
	/**
	 * Sleep method
	 * this method uses a random number generator for if the animal is rested
	 * @return
	 */
	public boolean sleep() {
		double b = rand2.nextDouble();
		if(b <= 0.5)
			return false;
		return true;
	}//End Sleep method
	
	/**
	 * ID method
	 * this method is to implement the try and catch statement for the InvalidSimIDException
	 * the exception will be caught if the SimID is less than 0
	 */
	public void ID() {
		InvalidSimIDException ise = new InvalidSimIDException("Invalid SimID");
		try {
			if(simID <= 0)
				throw ise;
		} catch (InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
	}//End ID method

//Getters and Setters
	
	public int getSimID() {
		return simID;
	}//End getter for SimID

	public void setSimID(int simID) {
		this.simID = simID;
	}//End setter for SimID

	public Location getLocation() {
		return location;
	}//End getter for location

	public void setLocation(Location location) {
		this.location = location;
	}//End setter for location

	public boolean isFull() {
		return full;
	}//End getter for Full

	public void setFull(boolean full) {
		this.full = full;
	}//End setter for full

	public boolean isRested() {
		return rested;
	}//End getter for rested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//End setter for rested
}//End Class Animal
