/* Class to hold information on a basic cruise ship
 * 
 */
public class BasicCruiseShip {
	private String name;
	private int numberOfStateRooms;
	private int numberOfRestaurants;
	
	
	public BasicCruiseShip(String name, int numberOfStateRooms, int numberOfRestaurants) {
		super();
		this.name = name;
		this.numberOfStateRooms = numberOfStateRooms;
		this.numberOfRestaurants = numberOfRestaurants;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the numberOfStateRooms
	 */
	public int getNumberOfStateRooms() {
		return numberOfStateRooms;
	}


	/**
	 * @param numberOfStateRooms the numberOfStateRooms to set
	 */
	public void setNumberOfStateRooms(int numberOfStateRooms) {
		this.numberOfStateRooms = numberOfStateRooms;
	}


	/**
	 * @return the numberOfRestaurants
	 */
	public int getNumberOfRestaurants() {
		return numberOfRestaurants;
	}


	/**
	 * add a single restaurant to the ship
	 * */
	public void addOneRestaurant() {
		this.numberOfRestaurants ++;
	}


	@Override
	public String toString() {
		return name + " has " + numberOfStateRooms + " state rooms and " + numberOfRestaurants + " restaurants";
	}
	

}
