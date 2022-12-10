
public class ApplicationForCruiseShips {

	public static void main(String[] args) {
		BasicCruiseShip ship1 = new BasicCruiseShip("Sailings R Us", 50,1);
		BasicCruiseShip ship2 = new BasicCruiseShip("Getaway Ship", 150,2);
		System.out.println(ship1);
		System.out.println(ship2);
		
		DeluxeCruiseShip bettership1 = new DeluxeCruiseShip("Ship For Great People", 300, 5, 4);
		System.out.println(bettership1);
		
		// DeluxeCruiseShip assumes 2 spas unless told otherwise
		DeluxeCruiseShip bettership2 = new DeluxeCruiseShip("Fantastic Getaways", 450,3);
		System.out.println(bettership2);
		System.out.println("--------------------");
		
		bettership1.addSpa();  // add 1 Spa 
		bettership1.addSpa();  
		System.out.println(bettership1);
		System.out.println(bettership2);
		System.out.println("--------------------");
		bettership2.addSpa();
		System.out.println(bettership1);
		System.out.println(bettership2);
		System.out.println("--------------------");
		bettership1.addRestaurants(4);  // adds 4 restaurants
		bettership2.addRestaurants(12); // adds 12 restaurants
		System.out.println(bettership1);
		System.out.println(bettership2);
		System.out.println("--------------------");
		bettership1.addRestaurants(2);  // adds 2 restaurants
		bettership2.addRestaurants(3); // adds 3 restaurants
		System.out.println(bettership1);
		System.out.println(bettership2);
		System.out.println("--------------------");
		
		DeluxeCruiseShip bettership3 = new DeluxeCruiseShip("Fantasia of the Seas",789, 6,4);
		System.out.println(bettership1);
		System.out.println(bettership2);
		System.out.println(bettership3);
		System.out.println("--------------------");
		int totalSpas = bettership1.getNumberOfSpas() + bettership2.getNumberOfSpas() + bettership3.getNumberOfSpas();
		System.out.println("Total number of Spas: " + totalSpas);
		

	}

}
