import java.util.ArrayList;
import java.util.Collections;


public class USLocationWork {

	public static void main(String[] args){

		String[] places1 = {"Newport News,Virginia","Miami,Florida","Richmond,Virginia","Memphis,Tennessee",
				"Denver,Colorado","San Francisco,California","Salem,Oregon","Boston,Massachusetts",
				"Montpelier,Vermont","Madison,Wisconsin","Des Moines,Iowa"
		};
		ArrayList<USLocation> list1 = new ArrayList<USLocation>();
		for (String onePlace: places1)
		{	    	
			String[] pieces = onePlace.split(",");
			USLocation thisPlace = new USLocation(pieces[0],pieces[1]);
			list1.add(thisPlace);
		}
		System.out.println(list1);
		System.out.println("--------------");
		System.out.println("PRINT ONE PER LINE:");
		displayListOfLocations(list1);
		

 		// ----------- PART B:
 
		System.out.println("--------------");
		System.out.println("NOW ADD SOME PLACES:");
		String[] places2 = {"Nashville,Tennessee","Newport News,Virginia", "Madison,Wisconsin","Miami,Florida",
				"Salem,Massachusetts","Portland,Maine","Seattle,Washington"
		};

		for (String onePlace: places2)
		{	    	
			String[] pieces = onePlace.split(",");
			USLocation thisPlace = new USLocation(pieces[0],pieces[1]);
			if (! list1.contains(thisPlace))
					list1.add(thisPlace);
		}
		displayListOfLocations(list1);
		

		

 			// ------------------ PART C:		

		System.out.println("---------------------------");
		Collections.sort(list1);
		System.out.println("NOW SORT THEM (sorted by state, and by city within the same state):");
		displayListOfLocations(list1);
		
	
		
		
	}

	//********************
	private static void displayListOfLocations(ArrayList<USLocation> places) {
		for (USLocation loc : places)
			System.out.println(loc);
	}
	
	

}