

//  A class for a DeluxeCruisShip that is a BasicCruiseShip that also has spas.
// DeluxeCruisShip assumes 2 spas, unless told otherwise
// For full credit, you must full utilize the inheritance so that if some details of the
// BasicCruiseShip class change (such as toString output formatting), this behavior of this class 
// also changes.

public class DeluxeCruiseShip extends BasicCruiseShip{
	private int numberOfSpas = 2;

	public DeluxeCruiseShip(String name, int rooms, int restaurants){
		super(name, rooms, restaurants);
	}

	public DeluxeCruiseShip(String name, int rooms, int restaurants, int spas){
		super(name, rooms, restaurants);
		numberOfSpas = spas;
	}

	public int getNumberOfSpas(){
		return numberOfSpas;
	}

	public void setNumberOfSpas(int spas){
		numberOfSpas = spas;
	}

	public void addRestaurants(int restaurants){
		for (int i = 1; i<=restaurants; i++)
			addOneRestaurant();
	
	}

	public void addSpa(){
		numberOfSpas++;
	}

	@Override
	public String toString(){
		return super.toString() + " and " + numberOfSpas + " spas.";
	}
}
