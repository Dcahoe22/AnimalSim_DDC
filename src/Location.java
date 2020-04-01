/**
 * Location Class Programming Project 3 CS131
 * This class is polymorphic to the Animal class, it gives an x and y coord onto a map
 * @author dalec
 *AnimalSim Project
 *Version 1
 *Spring 2020
 *3/31/20
 */
public class Location {

	//Instance variables
	private int xCoord;
	private int yCoord;
	
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}//End Empty Argument Constructor
	
	public Location(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}//End Preferred Constructor
	
	/**
	 * Update Method
	 * this method updates the x and y coord 
	 * @param x
	 * @param y
	 */
	public void update(int x, int y) {
		x= xCoord;
		y= yCoord;
	}//End Update method
	
	/**
	 * getCoordinates method
	 * this method will get the x and y coord and put them into an array
	 * @return 
	 * @return
	 */
	public int[] getCoordinates(int[] coords) {
		coords[0] = this.xCoord;
		coords[1] = this.yCoord;
		return coords;
	}//End GetCoordinate method
	
	/**
	 * Coord method
	 * this method implements the InvalidCoordinateException with a try and catch statement, it will throw the exception
	 * if a coordinate is entered less than zero
	 */
	public void Coord() {
		InvalidCoordinateException ice= new InvalidCoordinateException("Invalid Coordinate");
	try {
		if(xCoord < 0 || yCoord < 0)
			throw ice;
	} catch (InvalidCoordinateException a) {
		System.out.println(a.getMessage());
		}	
	}//End Coord method
	
//Getters and Setters
	public int getxCoord() {
		return xCoord;
	}//End getter xCoord

	public void setxCoord(int x) {
		this.xCoord = x;
	}//ENd setter xCoord

	public int getyCoord() {
		return yCoord;
	}//End getter yCoord

	public void setyCoord(int y) {
		this.yCoord = y;
	}//End setter yCoord
}//End Class Location
