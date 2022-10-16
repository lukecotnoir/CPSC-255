
public class Lodging {
	private String brand;
	private int numberOfRooms;
	public Lodging(String brand, int numberOfRooms) {
		super();
		this.brand = brand;
		this.numberOfRooms = numberOfRooms;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the numberOfRooms
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	/**
	 * @param numberOfRooms the numberOfRooms to set
	 */
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	@Override
	public String toString() {
		return brand + " has " + numberOfRooms + " rooms";

	}
	
	
	

}
