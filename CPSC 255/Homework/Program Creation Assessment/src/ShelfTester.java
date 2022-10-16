
public class ShelfTester {

	public static void main(String[] args) {
		Shelf shelf1 = new Shelf("wood",4);
		Shelf shelf2 = new Shelf("plastic",5);
		Shelf shelf3 = new Shelf("wood");
		Shelf shelf4 = new Shelf("glass");
		
		System.out.println("shelf1 is made of: " + shelf1.getMaterial());
		System.out.println("shelf2 is made of: " + shelf2.getMaterial());
		System.out.println("shelf3 is made of: " + shelf3.getMaterial());
		System.out.println("shelf4 is made of: " + shelf4.getMaterial());
		
		int total = shelf1.getLength() + shelf2.getLength() + shelf3.getLength() + shelf4.getLength();
		System.out.println("Total length is: " + total + " ft");
		
		System.out.println("----------------------");
		System.out.println(shelf1);
		System.out.println(shelf2);
		System.out.println(shelf3);
		System.out.println(shelf4);
		
		System.out.println("----------------------");
		System.out.println("Add some supports:");
		shelf1.addSupports(5);
		shelf2.addSupports(6);
		shelf1.addSupports(11);
		shelf3.addSupports(2);
		System.out.println(shelf1);
		System.out.println(shelf2);
		System.out.println(shelf3);
		System.out.println(shelf4);
	}

}
