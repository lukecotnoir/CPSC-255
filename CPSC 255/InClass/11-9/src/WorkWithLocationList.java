
public class WorkWithLocationList {

	public static void main(String[] args) {
		LinkedListLocations places = new LinkedListLocations();
		
		places.insertAtEnd(new USLocation("Richmond","Virginia"));
		places.insertAtEnd(new USLocation("Raleigh","North Carolina"));
		places.insertAtEnd(new USLocation("Denver","Colorado"));
		places.insertAtEnd(new USLocation("Newport News","Virginia"));
		places.insertAtEnd(new USLocation("Dover","Delaware"));
		
		places.displayList();
		System.out.println("============================");
		int answer = places.countInVirginia();
		System.out.println("The number in Virginia is:" + answer);
		
		System.out.println("============================");
		places.insertInSecondPlace(new USLocation("Boston","Massachusetts"));
		places.displayList();

	}

}
