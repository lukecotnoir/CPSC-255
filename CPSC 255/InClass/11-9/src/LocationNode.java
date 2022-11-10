
public class LocationNode {
	private USLocation data;
	private LocationNode next;
	
	public LocationNode(USLocation data, LocationNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public LocationNode(USLocation data) {
		super();
		this.data = data;
		this.next = null;
	}
	/**
	 * @return the data
	 */
	public USLocation getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(USLocation data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public LocationNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(LocationNode next) {
		this.next = next;
	}

}

