
public class BasicLinkedListOfAccounts {
	protected AccountNode  firstOne;
	
	// always starts off as an empty list
	public BasicLinkedListOfAccounts()
	{
		firstOne = null;
	}
	
	/*
	 * add this customer to the beginning of the list.
	 */
	public void insertAtBeginning(Account newcustomer) {
		AccountNode temp = new AccountNode(newcustomer);
		temp.setNext(firstOne);
		firstOne = temp;
	}
	/*
	 * create a fancy string with one item per line
	 */
	public String toString() {
		String toReturn;
		toReturn = "[" + "\n";
		AccountNode temp = firstOne;
		while (temp!=null) {
			toReturn = toReturn + "   " + temp.getData().toString() + "\n";
			temp = temp.getNext();
			}
		toReturn = toReturn + "]";

		return toReturn;
	}

}
