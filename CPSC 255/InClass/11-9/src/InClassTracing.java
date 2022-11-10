
public class InClassTracing {

	public static void main(String[] args) {

		f1();
		f2();
		f3();

	}

	private static void f1() {
		StringNode w = new StringNode("apple");
		StringNode x = new StringNode("banana",w);
		StringNode y = new StringNode("peach");
		y.setNext(x);
		StringNode z = new StringNode("pear",x);
		StringNode alpha = new StringNode("guava");
		alpha.setNext(alpha);
		displayStartingAt(w);
		displayStartingAt(x);
		displayStartingAt(y);
		displayStartingAt(z);
		displayStartingAt(alpha);
		
	}
	
	private static void displayStartingAt(StringNode first)
	{
		StringNode temp = first;
		while (temp!= null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	private static void f2() {
		StringNode first = new StringNode("happy");
		first.setNext( new StringNode("joyous"));
		first.getNext().setNext( new StringNode("sad"));
		first.getNext().getNext().setNext( new StringNode("gleeful"));
		StringNode another =  new StringNode("pensive",first);
		first.getNext().getNext().getNext().setNext( new StringNode("jovial"));
		
		displayStartingAt(first);
		
		displayStartingAt(another);
		
		first = another;
		displayStartingAt(first);
	}

	private static void f3() {
		StringNode beta = new StringNode("llama");
		beta = new StringNode("alpaca",beta);
		beta = new StringNode("hippo",beta);
		beta = new StringNode("ostrich",beta);
		beta = new StringNode("lion",beta);
		beta = new StringNode("camel",beta);
		
		// displayStartingAt(beta);
		
		// display2(beta);
		
		display3(beta);
	}
	
	private static void display2(StringNode first)
	{
		StringNode temp = first;
		System.out.println(temp.getData());
		while (temp.getNext()!= null) {
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
	
	private static void display3(StringNode first)
	{
		StringNode temp = first;
		while (temp!= null) {
			System.out.println(temp.getData());
			temp = temp.getNext().getNext();
		}
	}
	
}
