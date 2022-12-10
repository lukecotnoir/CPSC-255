public class DoLinkedLists {
	public static void main(String[] args) {
		ShipLinkedList shipList1 = new ShipLinkedList();
		shipList1.insertAtBeginning(new BasicCruiseShip("Sailings R Us", 50,1));
		shipList1.insertAtBeginning(new BasicCruiseShip("Getaway Ship", 150,2));
		shipList1.insertAtBeginning(new BasicCruiseShip("Seafarer", 220,3));
		shipList1.insertAtBeginning(new BasicCruiseShip("Goin' on the Waves", 150,1));
		shipList1.insertAtBeginning(new BasicCruiseShip("Jamie's Cruise Line", 450,4));
		shipList1.insertAtBeginning(new BasicCruiseShip("Epicure Cruises", 620,5));
		
		ShipLinkedList shipList2 = new ShipLinkedList();
		
		shipList2.insertAtBeginning(new BasicCruiseShip("Jamie's Cruise Line", 450,4));
		shipList2.insertAtBeginning(new BasicCruiseShip("Epicure Cruises", 620,5));
		shipList2.insertAtBeginning(new BasicCruiseShip("Sailings R Us", 50,1));
		shipList2.insertAtBeginning(new BasicCruiseShip("Getaway Ship", 150,2));
		shipList2.insertAtBeginning(new BasicCruiseShip("High Seas Hijinks", 250,3));
		shipList2.insertAtBeginning(new BasicCruiseShip("Ocean Voyager VI", 560,5));
		shipList2.insertAtBeginning(new BasicCruiseShip("Seafarer", 220,3));
		shipList2.insertAtBeginning(new BasicCruiseShip("Goin' on the Waves", 150,1));

		ShipLinkedList shipList3 = new ShipLinkedList();
		
		int largeShips ;

		largeShips = shipList1.countLargeShips();
		System.out.println("Number of large ships in shipList1:" + largeShips);
		
		largeShips = shipList2.countLargeShips();
		System.out.println("Number of large ships in shipList2:" + largeShips);

		largeShips = shipList3.countLargeShips();
		System.out.println("Number of large ships in shipList3:" + largeShips);

		String biggest ;

		biggest = shipList1.getNameOfShipWithMostRooms();
		System.out.println("The ship in shipList1 with the most rooms:" + biggest);

		biggest = shipList2.getNameOfShipWithMostRooms();
		System.out.println("The ship in shipList2 with the most rooms:" + biggest);

		biggest = shipList3.getNameOfShipWithMostRooms();
		System.out.println("The ship in shipList3 with the most rooms:" + biggest);
	}
	
}
