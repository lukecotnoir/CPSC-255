
// hold a basic Stack of Strings.   Limited documentation is intentional for exploration.
public class StackOfStrings {
	private StringNode top;
	
	public StackOfStrings()
	{
		top = null;
	}
	
	public void push(String newone) {
		top = new StringNode(newone,top);
	}
	// return the item on top.  Sometimes the operation is called "peek".
	public String top() {
		if (top == null)  // really, throwing an exceptoin would be better here.  See the next reading.
		{
			System.out.println("ERROR:  nothing on top of stack for request");
			return "ERROR";
		}
		else
			return top.data;
	}
	// remove the item on top
	public void pop() {
		if (empty())// really, throwing an exception would be better here.  See the next reading.
		{
			System.out.println("ERROR:  nothing on top of stack for pop");
		}
		else
			top = top.next;
	
	}
	public boolean empty() {
		return top == null;
	}

	/*
	 * create a fancy string with one item per line
	 */
	public String toString() {
		String toReturn;
		toReturn = "[" + "\n";
		StringNode temp = top;
		while (temp!=null) {
			toReturn = toReturn + "   " + temp.data.toString() + "\n";
			temp = temp.next;
			}
		toReturn = toReturn + "]";

		return toReturn;
	}
	
	//********** nested class with limited documentation
	private class StringNode {
		public StringNode(String data, StringNode next) {
			this.data = data;
			this.next = next;
		}
		
		public String data;
		public StringNode next;
	}
}

