import java.util.ArrayList;
import java.util.Collections;


public class WorkWithMovies {

	public static void main(String[] args){

		Movie[] films1 = { new Movie("Black Adam",124, 2022),new Movie("Ticket To Paradise",104,2022),
				new Movie("Lyle,Lyle,Crocodile",106,2022), new Movie("Christine",110,1983),
				new Movie("The Wizard of Oz",101,1939)
		};
		ArrayList<Movie> listOfMovies = new ArrayList<Movie>();
		for (Movie oneMovie: films1)
			listOfMovies.add(oneMovie);
		
		displayListOfMovies(listOfMovies);
		

       // ----- PART B:

		System.out.println("====================");
		System.out.println("NOW ADD SOME:");
		Movie[] films2 = { new Movie ("Casablanca",102,1942), new Movie("Black Adam",124, 2022),
				new Movie("Christine",119,2016),new Movie("Ticket To Paradise",104,2022),
				new Movie("Gone With The Wind",221,1939)
		};
		
		for (Movie oneMovie: films2)
			if (! listOfMovies.contains(oneMovie))
					listOfMovies.add(oneMovie);
		displayListOfMovies(listOfMovies);
		


		// ------------- PART C:

		System.out.println("================");
		System.out.println("NOW SORT THEM");
		Collections.sort(listOfMovies);
		displayListOfMovies(listOfMovies);
		
	}

	//********************
	private static void displayListOfMovies(ArrayList<Movie> films) {
		for (Movie m : films)
			System.out.println(m);
	}
	
	

}
