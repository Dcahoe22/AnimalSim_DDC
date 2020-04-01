/**
 * Goldfinch Class Programming Project 3 CS131
 * This class is subclass of animal, it implements 2 interfaces called walkable and flyable, the class instantiates a goldfinch object 
 * @author dalec
 *AnimalSim Project
 *Version 1
 *Spring 2020
 *3/31/20
 */

public class Goldfinch extends Animal implements Walkable, Flyable{

	//Instance varible
	private double wingSpan;
	
	public Goldfinch() {
		simID = 0;
		Location l = new Location(0,0);
		full = false;
		rested = true;
		wingSpan = 9.0;
	}//End empty Argument Constructor
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		this.simID = simID;
		this.location = l;
		this.wingSpan = wingSpan;
		this.full = false;
		this.rested = true;
	}//End Preferred Constructor
	
	/**
	 * Wingspan method
	 * this method implements the InvalidWingSpanException, the exception will be thrown if the wingspan is entered less than 5
	 * or greater than 11
	 */
	public void wingSpan() {
		InvalidWingspanException iwse = new InvalidWingspanException("Invalid WingSpan");
	try {
		if(wingSpan < 5.0 || wingSpan > 11.0)
			throw iwse;
	}catch (InvalidWingspanException w) {
		System.out.println(w.getMessage());
		}
	}//End windSpan method
	
//Getters and Setters	
	public double getWingSpan() {
		return wingSpan;
	}//End getter wingSpan

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}//End setter wingSpan

//Interfaces
	/**
	 * Flyable interface
	 * this interface will change the direction of the goldfinch moving it wherever the new location is
	 */
	@Override
	public void fly(Location l) {
		l = new Location();
		System.out.println("The Gold Finch flew from "+ location.getCoordinates(null));
		location.update(l.getxCoord()+ location.getxCoord(), l.getyCoord()+ location.getyCoord());
		System.out.println("To "+ location.getCoordinates(null));
	}//End Fly interface
	
	/**
	 * Walkable interface
	 * this interface will change direction of the goldfinch for 1 unit
	 */
	@Override
	public void walk(int direction) {
		Location l;
		int n = direction;
		if(direction > 1) {
			n= 1;
		}
		l = new Location(n, n);
		System.out.println("The Gold Finch Walked from "+ location.getCoordinates(null));
		location.update(l.getxCoord()+ location.getxCoord(), l.getyCoord()+ location.getyCoord());
		System.out.println("To "+ location.getCoordinates(null));
	}//End Walk interface
}//End Class Goldfinch
