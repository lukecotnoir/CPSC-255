import java.util.ArrayList;

public class LinkedListOfStringWithMore extends BasicLinkedListOfStrings {

	public LinkedListOfStringWithMore() {
		super();
	}
	
	/** creates a linked list that contains  all data in the parameter
	 * Does not matter the order, as long as all of the data
	 * ends up in this linkedlist.
	 * */

	public LinkedListOfStringWithMore(ArrayList<String> newdata) {
		firstOne = new NodeWithString(newdata.get(0));
		NodeWithString prev = firstOne;
		for (int i = 1; i<newdata.size(); i++){
			NodeWithString temp = new NodeWithString(newdata.get(i));
			prev.setNextOne(temp);
			prev = temp;
		}
	}
	
	/*
	 * returns an ArrayList containing all of the strings in this linked 
	 * list that are longer than 5 characters.
	 * In the ArrayList, they appear in the same order as they appeared in this
	 * linked list.
	 */
	public ArrayList<String> longStrings(){
		ArrayList<String> longs = new ArrayList<String>();
		NodeWithString temp = firstOne;
		while(temp.getNextOne() != null){
			if (temp.getData().length()>5) longs.add(temp.getData());
			temp = temp.getNextOne();
		}
		return longs;
	}
	
	
	/*
	 * returns an ArrayList containing all of the strings in this linked 
	 * list that are longer than 5 characters.
	 * In the resulting list, they appear in the same order as they appeared in this
	 * linked list.
	 */
	public LinkedListOfStringWithMore theLongStrings(){
		return (new LinkedListOfStringWithMore(longStrings()));
	}
}
