import java.util.ArrayList;

public class DoArrayLists {

	public static void main(String[] args) {
		ArrayList<BasicCruiseShip> list1 = new ArrayList<BasicCruiseShip>();
		list1.add(new BasicCruiseShip("Sailings R Us", 50,1));
		list1.add(new BasicCruiseShip("Getaway Ship", 150,2));
		list1.add(new BasicCruiseShip("Seafarer", 220,3));
		list1.add(new BasicCruiseShip("Goin' on the Waves", 150,1));
		list1.add(new BasicCruiseShip("Jamie's Cruise Line", 450,4));
		list1.add(new BasicCruiseShip("Epicure Cruises", 620,5));

		ArrayList<BasicCruiseShip> list2 = new ArrayList<BasicCruiseShip>();
		list2.add(new BasicCruiseShip("Jamie's Cruise Line", 450,4));
		list2.add(new BasicCruiseShip("Epicure Cruises", 620,5));
		list2.add(new BasicCruiseShip("Sailings R Us", 50,1));
		list2.add(new BasicCruiseShip("Getaway Ship", 150,2));
		list2.add(new BasicCruiseShip("High Seas Hijinks", 250,3));
		list2.add(new BasicCruiseShip("Ocean Voyager VI", 560,5));
		list2.add(new BasicCruiseShip("Seafarer", 220,3));
		list2.add(new BasicCruiseShip("Goin' on the Waves", 150,1));


	
		
		String smallest ;
		smallest = getNameOfShipWithFewestRooms(list1);
		System.out.println("The ship in list1 with the fewest rooms:" + smallest);
		smallest = getNameOfShipWithFewestRooms(list2);
		System.out.println("The ship in list2 with the fewest rooms:" + smallest);
		
		System.out.println("-----------------");
		System.out.println(list1);
		convertTwoRooms(list1);
		System.out.println("Now the list after removing two rooms from use on each ship:");
		System.out.println(list1);
		System.out.println("-----------------");
		System.out.println(list2);
		convertTwoRooms(list2);
		System.out.println("Now the list after removing two rooms from use on each ship:");
		System.out.println(list2);

	}
	/*
	 * returns the name of the ship  that has the fewest rooms.   If there is a tie,
	 * any of them can be returned.  
	 * If the list is empty, return "no ships in port"
	 */
	public static String getNameOfShipWithFewestRooms(ArrayList<BasicCruiseShip> data) {
		String fewestRoomsName = "no ships in port";
		int fewestRooms = 100000000;
		for (BasicCruiseShip i : data){
			if (i.getNumberOfStateRooms() < fewestRooms){
				fewestRoomsName = i.getName();
				fewestRooms = i.getNumberOfStateRooms();
			}
		}
		return fewestRoomsName;
	}

	/*
	 *  Remove two rooms from the count of state rooms for each ship in the list.
	 */
	public static void convertTwoRooms(ArrayList<BasicCruiseShip> data) {
		for (BasicCruiseShip i : data){
			i.setNumberOfStateRooms(i.getNumberOfStateRooms()-2);
		}
	}

	
}
