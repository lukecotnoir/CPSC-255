
public class AccountNode {
	private Account data;
	private AccountNode next;
	
	public AccountNode(Account data, AccountNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	public AccountNode(Account data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	
	/**
	 * @return the data
	 */
	public Account getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Account data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public AccountNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(AccountNode next) {
		this.next = next;
	}

	
	

}
