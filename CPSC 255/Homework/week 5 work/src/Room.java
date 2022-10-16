
public class Room {
	
	private String name;
	private int bookshelves = 3;
	private int therm = 68;
	
	public Room(String name) {
		this.name = (name + " Room");
		bookshelves = 3;
		therm = 68;
	}
	
	public Room (String name, int bookshelves) {
		this.name = (name + " Room");
		this.bookshelves = bookshelves;
	}
	
	public String getLabel() {
		return name;
	}
	
	public int getNumberOfShelves() {
		return bookshelves;
	}
	
	public void changeLabel(String newName) {
		name = newName;
	}
	
	public void addShelves(int shelves) {
		bookshelves += shelves;
	}
	
	public void raiseThermBy(double temp) {
		therm += temp;
	}
	
	public void changeThermTo(int temp) {
		therm = temp;
	}
	
	public int getTherm() {
		return therm;
	}
	
	public double getThermC() {
		double d = therm;
		return ((d-32.0)*(5.0/9.0));
	}
	
	public String toString() {
		return name + ", " + bookshelves + " shelves, " + therm + " F";
	}
}

