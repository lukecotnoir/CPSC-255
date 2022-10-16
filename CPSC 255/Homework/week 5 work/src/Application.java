
public class Application {

	public static void main(String[] args) {
		/***** part A */
		Room room1 = new Room("Smith");
		Room room2 = new Room("Jones Memorial Study", 5);
		Room room3 = new Room("Scott's hideout", 10);

		System.out.println("Our rooms:");
		System.out.println(room1.getLabel() + ", with " + room1.getNumberOfShelves() + " shelves.");
		System.out.println(room2.getLabel() + ", with " + room2.getNumberOfShelves() + " shelves.");
		System.out.println(room3.getLabel() + ", with " + room3.getNumberOfShelves() + " shelves.");

		/**** part B */
		room1.changeLabel("Smith BallRoom");
		room3.changeLabel("Scott's secret hideout");
		room2.addShelves(2);
		room3.addShelves(3);
		room1.addShelves(1);
		room3.addShelves(1);
		System.out.println();
		System.out.println("Our rooms after some changes:");
		System.out.println(room1.getLabel() + ", with " + room1.getNumberOfShelves() + " shelves.");
		System.out.println(room2.getLabel() + ", with " + room2.getNumberOfShelves() + " shelves.");
		System.out.println(room3.getLabel() + ", with " + room3.getNumberOfShelves() + " shelves.");

		/******** PArt C */

		System.out.println("Change thermostats:");
		room1.raiseThermBy(10);
		room2.changeThermTo(60);
		room3.changeThermTo(32);
		System.out.println();
		System.out.println("Our room thermostats:");
		System.out.println(room1.getLabel() + ", set at " + room1.getTherm() + " degrees Fahrenheit ");
		System.out.println(room2.getLabel() + ", set at " + room2.getTherm() + " degrees Fahrenheit ");
		System.out.println(room3.getLabel() + ", set at " + room3.getTherm() + " degrees Fahrenheit ");
		System.out.println();
		System.out.println("Report Celsius.");
		System.out.println(room1.getLabel() + ", set at " + room1.getThermC() + " degrees Celsius ");
		System.out.println(room2.getLabel() + ", set at " + room2.getThermC() + " degrees Celsius ");
		System.out.println(room3.getLabel() + ", set at " + room3.getThermC() + " degrees Celsius ");

		/* *** part D */
		System.out.println();
		System.out.println("Our rooms now:");
		System.out.println(room1);
		System.out.println(room2);
		System.out.println(room3);

	}

}