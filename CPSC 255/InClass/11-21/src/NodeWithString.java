
public class NodeWithString {
	private String data;
	private NodeWithString nextOne;
	public NodeWithString(String data, NodeWithString nextOne) {
		super();
		this.data = data;
		this.nextOne = nextOne;
	}
	public NodeWithString(String data) {
		super();
		this.data = data;
		this.nextOne = null;
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
	 * @return the nextOne
	 */
	public NodeWithString getNextOne() {
		return nextOne;
	}
	/**
	 * @param nextOne the nextOne to set
	 */
	public void setNextOne(NodeWithString nextOne) {
		this.nextOne = nextOne;
	}
	
	
}
