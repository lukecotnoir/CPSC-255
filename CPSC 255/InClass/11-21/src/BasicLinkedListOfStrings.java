
public class BasicLinkedListOfStrings {
	protected NodeWithString  firstOne;
	
	// always starts off as an empty list
	public BasicLinkedListOfStrings()
	{
		firstOne = null;
	}
	
	/*
	 * add this customer to the beginning of the list.
	 */
	public void insertAtBeginning(String dataToBeAdded) {
		NodeWithString temp = new NodeWithString(dataToBeAdded);
		temp.setNextOne(firstOne);
		firstOne = temp;
	}
	/*
	 * create a fancy string with one item per line
	 */
	public String toString() {
		String toReturn;
		toReturn = "[" + "\n";
		NodeWithString temp = firstOne;
		while (temp!=null) {
			toReturn = toReturn + "   " + temp.getData().toString() + "\n";
			temp = temp.getNextOne();
			}
		toReturn = toReturn + "]";

		return toReturn;
	}

}
