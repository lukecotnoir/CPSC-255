
public class RoomArrays {
	
	/* returns how many rooms in the building have more than 5 shelves
	 * */

	public static int lotsOfShelves(Room[] building)
	{
		int cnt = 0;
		for (Room i : building) {
			if (i.getNumberOfShelves() > 5) cnt++;
		}
		return cnt;
	}

	/** returns the name of the room with the most shelves 
	 * If there is a tie, break it as you see fit.
		If the array is empty, return "NONE".
	 */
	public static String mostShelves(Room[] building)
	{
		Room maxRoom = new Room("NONE");
		for (Room i : building) {
			if (i.getNumberOfShelves()> maxRoom.getNumberOfShelves()) maxRoom = i;
		}
		return maxRoom.getLabel();
	}
	
	/* return the total number of shelves in the building
	 * */
	public static int totalShelves(Room[] building)
	{
		int cnt = 0;
		for (Room i : building) {
			cnt += i.getNumberOfShelves();
		}
		return cnt;
	}
	
	/**  return True if all of the rooms in the building have at least 6 shelves.
	 * Return False otherwise.
	 *
	 */
	public static boolean allHaveSeveral(Room [] building)
	{
		for (Room i : building) {
			if (i.getNumberOfShelves()<6) return false;
		}
		return true;
	}
	
	/** return an array of all of the rooms that have a thermostat over
	 * 80 degrees.  The rooms should be in the same order as in the parameter.
	 */
	public static Room[] hotRooms(Room [] building)
	{
		int hotCnt = 0;
		for (Room i : building) {
			if (i.getTherm()>80) hotCnt++;
		}
		Room[] hotRooms = new Room[hotCnt];
		int a = 0;
		for (int i = 0; i<building.length; i++) {
			if (building[i].getTherm()>80) {
				hotRooms[a] = building[i];
				a++;
			}
		}
		return hotRooms;
	}
	

	//*********************************************************
	public static void main(String[] args) {

		Room[] building1 = {new Room("Smith", 6),
				new Room("Jones",20),
				new Room("Shah")
				};
		Room[] building2 = {new Room("Study", 26),
			new Room("Lab",6),
			new Room("Office",9),
			new Room("Research",7)
			};
		
		building2[0].changeThermTo(81);
		building2[2].changeThermTo(81);
		building2[3].changeThermTo(81);
		
		System.out.println("Expected: 2		Result: " + lotsOfShelves(building1)); //should print 2
		System.out.println("Expected: 4 		Result: " + lotsOfShelves(building2)); //should print 2
		
		System.out.println("Expected: Jones Room 	Result: " + mostShelves(building1));
		System.out.println("Expected: Study Room 	Result: " + mostShelves(building2));
		
		System.out.println("Expected: 29 		Result: " + totalShelves(building1));
		System.out.println("Expected: 48 		Result: " + totalShelves(building2));
		
		System.out.println("Expected: false 	Result: " +allHaveSeveral(building1));
		System.out.println("Expected: true 		Result: " +allHaveSeveral(building2));
		
		System.out.println();
		System.out.println("Expected: (not supposed to return anything)");
		System.out.print("Result: ");
		for (Room i : hotRooms(building1)) {
			System.out.print(i.getLabel() + ",");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Expected: Study Room, Office Room, Research Room,");
		System.out.print("Result:	  ");
		for (Room i : hotRooms(building2)) {
			System.out.print(i.getLabel() + ", ");
		}
	}

}
