
public class StringNode {
	private String data;
	private StringNode next;
	
	public StringNode(String data, StringNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public StringNode(String data) {
		super();
		this.data = data;
		this.next = null;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public StringNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(StringNode next) {
		this.next = next;
	}

}
