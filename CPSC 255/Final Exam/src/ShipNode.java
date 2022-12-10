public class ShipNode {
	private BasicCruiseShip data;
	private ShipNode next;
	public ShipNode(BasicCruiseShip data, ShipNode next) {
		this.data = data;
		this.next = next;
	}
	public ShipNode(BasicCruiseShip data) {
		this.data = data;
		this.next = null;
	}
	/**
	 * @return the data
	 */
	public BasicCruiseShip getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(BasicCruiseShip data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public ShipNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(ShipNode next) {
		this.next = next;
	}
	
}
