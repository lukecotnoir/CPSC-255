import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.util.Scanner;

/*
 * Reads in newsfile information, makes some modifications (specified below) and rewrites the file
 * Format of file:  each person is on one line with name, role, and years of experience separated by commas
 * 
 * Modifications:  
 *      all team members have one year of experience added to their record
 *      all team members whose role is "Weather" gets the role changed to "Meteorology"
 */


public class NewsFiles {

	public static void main(String[] args) throws FileNotFoundException  {
		String thefile = "channel4.txt";
		ArrayList<NewsPerson> team = getData(thefile);
		System.out.println("The team is:");
		printList(team);
		
		System.out.println("\nThe total years of experience is: "+ totalYears(team));
		
		modifyList(team);
		System.out.println("\n\nAfter modifications, the team is:");
		printList(team);

		System.out.println("\nSaving info to file......");
		saveInfo(team,thefile);
		System.out.println("done.");
		

	}
	
	/*
	 * return the total of all of the years of experience on the team.  (Add them up)
	 */
	private static int totalYears(ArrayList<NewsPerson> team) {
		int total = 0;
		for (NewsPerson temp : team) total += temp.getYears();
		return total;
	}

	/*
	 * write the info on the team to the file indicated by thefile.   
	 * The format of the file should be the same as was read in (so the program
	 * could re-read the file if desired).
	 */
	private static void saveInfo(ArrayList<NewsPerson> team, String thefile) throws FileNotFoundException {
		PrintWriter outFS = new PrintWriter(new FileOutputStream(thefile));
		for (NewsPerson temp : team) {
			outFS.println(temp.toString());
		}
		outFS.close();
	}

	/*
	 * For everyone whose role is "Weather", change it to "Meteorology".
	 */
	private static void modifyList(ArrayList<NewsPerson> team) {
		for (NewsPerson temp : team) {
			if (temp.getRole().equals("Weather")) temp.setMyrole("Meteorology");
		}
	}
	/*
	 * print out each person, one per line
	 */
	private static void printList(ArrayList<NewsPerson> team) {
		if (team == null){
			System.out.println("*** ERROR.  team list sent to this function was null. *****");
			return;
		}
		for (NewsPerson person : team)
			System.out.println(person);
		
	}

	/*
	 * Creates an ArrayList of NewsPerson object references using the info from the indicated file.
	 * IF there is not data in the file, it returns an empty ArrayList, not null.
	 */
	private static ArrayList<NewsPerson> getData(String filename) throws FileNotFoundException {
		Scanner inFS = new Scanner(new FileInputStream(filename));
		ArrayList<NewsPerson> newsPersons = new ArrayList<>();
		while(inFS.hasNext()) {
			String[] tempInfo = inFS.nextLine().split(",");
			newsPersons.add(new NewsPerson(tempInfo[0], tempInfo[1], Integer.parseInt(tempInfo[2])));
		}
		inFS.close();
		return newsPersons;
	}

}
