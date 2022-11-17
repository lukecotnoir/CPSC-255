import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class BirdSightingFiles {

	public static void main(String[] args) throws IOException {

		String [] sampleFiles = {"monday.txt","tuesday.txt","wednesday.txt","thursday.txt","friday.txt"};
		for (String onefile: sampleFiles)
		{
			int total = totalBirdSightings(onefile);
			System.out.println("There were " + total + " birds sighted in " + onefile)	;
		}
		
		// now test the dayWithMost  function
		
		System.out.println("The name of the file with the most was : " + dayWithMost(sampleFiles));
		System.out.println("\nGiven no data files : ");
		String[] nofiles = {};
		System.out.println("The name of the file with the most was : " + dayWithMost(nofiles));
		System.out.println("\nGiven only Mon,Tue, and Fri : ");
		String[] someFiles = {"monday.txt","tuesday.txt","friday.txt"};
		System.out.println("The name of the file with the most was : " + dayWithMost(someFiles));
		System.out.println("\n**** Student is welcome and encouraged to create more test cases, modifying main as necessary.***");

	}

	/*
	 * Given the list of files to consider, which one has the largest total.
	 * If there is a tie, of those that are tied, return the first one in the list.
	 * If the list is empty, return "no data".
	 */
	private static String dayWithMost(String[] listOfBirdFileNames) throws FileNotFoundException {
		if (listOfBirdFileNames.length == 0) return "no data";
		HashMap<Integer, String> totals = new HashMap<>();
		int max = 0;
		for (int i = 0; i<listOfBirdFileNames.length-1; i++) {
			String filename = listOfBirdFileNames[i];
			int tempTotal = totalBirdSightings(filename);
			totals.put(tempTotal, filename);
			if (tempTotal > max) max = tempTotal;
		}
		return totals.get(max);

	}

	/**
	 * Reads the list of numbers in the given file and returns the total of them.
	 * @param filename
	 * @return the sum of the numbers
	 */
	private static int totalBirdSightings(String filename) throws FileNotFoundException{
		Scanner inFS = new Scanner(new FileInputStream(filename));
		int total = 0;
		while (inFS.hasNext()) {
			total+=inFS.nextInt();
			// total += inFS.nextInt();
		}
		inFS.close();
		return total;
	}

}
