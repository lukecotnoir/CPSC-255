
public class LinkedListLocations {
	private LocationNode firstOne;
	
	public LinkedListLocations()
	{
		firstOne = null;
	}
	
	public void displayList() {
		LocationNode temp = firstOne;
		while (temp!=null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	public void insertAtBeginning(USLocation newData) {
		LocationNode newBox = new LocationNode(newData);
		newBox.setNext(firstOne);
		firstOne = newBox;
	}
	

	public void insertAtEnd(USLocation newData) {
		if (firstOne == null)
		{
			insertAtBeginning(newData);
			return;
		}
		LocationNode temp = firstOne;
		while (temp.getNext()!=null) {
			temp = temp.getNext();
		}
		LocationNode newBox = new LocationNode(newData);
		temp.setNext(newBox);
	}
	
	
	// how many in the list are in Virginia?
		public int countInVirginia() {
			LocationNode temp = firstOne;
			int cnt = 0;
			while(temp != null) {
				if (temp.getData().getState().equals("Virginia")) cnt++;
				temp = temp.getNext();
			}
			return cnt;
		}
		
		// add the new data into the list such that it is in the second place in the list.
		// YOU MAY ASSUME that here is already at least one thing in the list.
		public void insertInSecondPlace(USLocation newdata) {
			LocationNode temp = new LocationNode(newdata, firstOne.getNext());
			firstOne.setNext(temp);
		}
}
