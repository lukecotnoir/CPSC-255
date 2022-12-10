
public class ShipLinkedList {
	
	private ShipNode firstOne;
	
	public ShipLinkedList() {
		firstOne = null;
	}

	public void insertAtBeginning(BasicCruiseShip newdata) {
		firstOne = new ShipNode(newdata,firstOne);
	}
	
	/*
	 * Return the number of ships with more than 200 state rooms.
	 */
	public int countLargeShips() {
		ShipNode temp = firstOne;
		int count = 0;
		while (temp != null){
			int tempRooms = temp.getData().getNumberOfStateRooms();
			if (tempRooms > 200) count++;
			temp = temp.getNext();
		}
		return count;
	}

	/*
	 * returns the name of the ship that has the most state rooms.   If there is a tie,
	 * any of them can be returned.  
	 * If the list is empty, return "no ships in port"
	 */
	public String getNameOfShipWithMostRooms() {
		ShipNode temp = firstOne;
		ShipNode biggest = temp;
		if (!(firstOne != null)) return "no ships in port";
		while (temp != null){
			if (temp.getData().getNumberOfStateRooms() > biggest.getData().getNumberOfStateRooms())
				biggest = temp;
			temp = temp.getNext();
		}
		return biggest.getData().getName();
	}
}
