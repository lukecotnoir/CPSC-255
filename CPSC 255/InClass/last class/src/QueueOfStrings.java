// hold a basic Queue of Strings.   Limited documentation is intentional for exploration.
public class QueueOfStrings {
	private StringNode first;
	
	public QueueOfStrings()
	{
		first = null;
	}
	
	public void enQ(String newone) {
		if (empty())
			first = new StringNode(newone,null);
		else
		{
			StringNode last = first;  // assume last one and see if we need to update
			while (last.next != null)
			{
				last = last.next;
			}
			last.next = new StringNode(newone,null);
		}

	}
	
	// return the item in the front.  Sometimes the operation is called "peek".
	public String front() {
		if (first == null)  // really, throwing an exception would be better here.  See the next reading.
		{
			System.out.println("ERROR:  nothing in queue to satisfy request");
			return "ERROR";
		}
		else
			return first.data;
	}
	// remove the item in front
	public void deQ() {
		if (empty())// really, throwing an exception would be better here.  See the next reading.
		{
			System.out.println("ERROR:  nothing in queue to remove in deQueue operation");
		}
		else
			first = first.next;
	
	}
	public boolean empty() {
		return first == null;
	}

	/*
	 * create a fancy string with one item per line
	 */
	public String toString() {
		String toReturn;
		toReturn = "[" + "\n";
		StringNode temp = first;
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

