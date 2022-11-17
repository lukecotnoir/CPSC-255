
public class FullerLinkedListOfAccounts extends BasicLinkedListOfAccounts {
	
	// start off as empty list.
	public FullerLinkedListOfAccounts() {
		super();
	}
	

	/*
	 * how many total accounts are there?
	 */
	public int howManyAccounts() {
		AccountNode temp = firstOne;
		int total = 0;
		while(temp!=null) {
			total ++;
			temp = temp.getNext();
		}
		return total;
	}
	/*
	 * return total of all account balances
	 */
	public double totalHoldings() {
		AccountNode temp = firstOne;
		int total = 0;
		while(temp!=null) {
			total += temp.getData().getBalance();
			temp = temp.getNext();
		}
		return total;
	}
	
	/*
	 * return total of funds in all savings accounts
	 */
	public double totalSavings() {
		AccountNode temp = firstOne;
		int total = 0;
		while(temp!=null) {
			if (temp.getData() instanceof SavingsAccount) total += temp.getData().getBalance();
			temp = temp.getNext();
		}
		return total;
	}
	
	/*
	 * return the account number for the joint account with the highest balance.
	 * Tie?   Return the last in the list.
	 * Empty list?  return 0
	 */
	public int  largestJointAccount()
	{
		AccountNode temp = firstOne;
		int maxNumber = 0;
		int maxBalance = 0;
		while(temp!=null) {
			if (temp.getData() instanceof JointAccount && temp.getData().getBalance() > maxBalance) 
				maxNumber += temp.getData().getNumber();
			temp = temp.getNext();
		}
		return maxNumber;
	}
	
	/*
	 * return how many accounts have more money than the one before them in the list.
	 */
	public int howManyLargerThanOneBefore()
	{
		AccountNode temp = firstOne;
		AccountNode prev = firstOne;
		int total = 0;
		while(temp!=null) {
			if (temp.getData().getBalance() > prev.getData().getBalance()) total += temp.getData().getBalance();
			prev = temp;
			temp = temp.getNext();
		}
		return total;
	}
	/*
	 * change the name of the owner to each account to be in all caps.  Thus "Scott" becomes "SCOTT".
	 */
	public void capitalizeAll() {
		AccountNode temp = firstOne;
		while(temp!=null) {
			temp.getData().setOwner(temp.getData().getOwner().toUpperCase());
			temp = temp.getNext();
		}
	}
	/*
	 * insert the new customer at the end of the list
	 */
	public void insertAtEnd(Account newcustomer) {
		AccountNode temp = firstOne;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		temp.setNext(new AccountNode(newcustomer));
	}
	/*
	 * remove the second item from the list. 
	 * If there is only one item, do nothing.
	 */
	public void removeSecond() {
		firstOne.setNext(firstOne.getNext().getNext());
	}


}
