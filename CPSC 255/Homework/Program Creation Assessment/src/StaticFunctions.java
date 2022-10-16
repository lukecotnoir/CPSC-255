import java.util.ArrayList;

public class StaticFunctions {
	//********************************
	// This very simplistic function merely returns a single string - the password assigned
	// to you for this exam.
	
	//  ------ NOTE  ---------
	//   IF THE getPassword FUNCTION DOES NOT WORK, THE SCORE ON THE ENTIRE EXAM WILL BE 0.
	
	public static String getPassword()
	{
		return "hurricane";
	}
	
	//********************************
	/*
	 * This function determines if a tv show was well received based on genre and viewership rating
	 * It is returns "well received" or "not received well" based on the following:
	 * 
	 * genre "Comedy" :
	 *       viewership over 30:    "well received"
	 *       30 or under:  "not received well"
	 *  genre "Horror":
	 *       viewership over 45:    "well received"
	 *       45 or under:  "not received well"
	 *  genre "SuperHero":
	 *       viewership over 70:    "well received"
	 *       70 or under:  "not received well"
	 *  It is assumed that the genre parameter is either "Comety","Horror" or "SuperHero".
	 *  any other value for genre does not need to be checked.
	 */

	public static String getReception(String genre, int viewership)
	{
		if (genre.equals("Comedy")) {
			if (viewership >= 30) return "well received";
			else return "not received well";
		}
		else if (genre.equals("Horror")) {
			if (viewership >= 45) return "well received";
			else return "not received well";
		}
		else if (genre.equals("SuperHero")) {
			if (viewership >= 70) return "well received";
			else return "not received well";
		}
		return "Error: not a valid input";
	}

	
	//********************************
	/*
	 * This function counts and returns how many times a question mark appears in the string.  
	 * EG:  phrase = "Really??" would return 2  and phrase = "Good Morning! How are you?", the function should return 1.
	 */

	public static int computeWithString(String phrase)
	{
		int cnt = 0;
		for (int i=0; i<phrase.length(); i++) {
			if (phrase.charAt(i) == '?') cnt++;
		}
		return cnt;
	}
	
	//********************************
	/*
	 * This function determines and returns the total number of question marks in the whole list.
	 * EG:  {"Ready???","Now?","When??"}   has 6 question marks.
	 */

	public static int measureInquisitiveness(String [] listOfStrings) {
		int cnt = 0;
		for (String i : listOfStrings) {
			int q = computeWithString(i);
			cnt += q;
		}
		return cnt;
	}
	//*********************************
	/*
	 * create and return an ArrayList of Strings that has the following
	 * data in order:
	 * "Yo-yo Ma","Arturo Sandoval","Lindsey Buckingham","Beyonce","Penn and Teller"
	 */
	public static ArrayList<String> getSomeData() {
		ArrayList<String> someData = new ArrayList<String>();
		someData.add("Yo-yo Ma");
		someData.add("Arturo Sandoval");
		someData.add("Lindsey Buckingham");
		someData.add("Beyonce");
		someData.add("Penn and Teller");
		return someData;
	}

	
	
	//********************************
	/*
	 * This function returns the string in the list that has the most question marks.
	 *  EG:  In  {"Ready???","Now?","When??"}  the first string "Ready???" has the most question marks.
	 *  If there is a tie, return any one of them, it does not matter which
	 *        EG:  In {"Hi!", "Goodbye!"}   either "Hi!" or "Goodbye!" would be acceptable answers.
	 *  If the list is empty, return "no inquisitiveness".
	 *  EG  {}  should return "no inquisitiveness"
	 *      {"X", "Y"}   should return either X or Y since 0 is the most inquisitiveness
	 */     

	public static String mostInquisitive(ArrayList<String> listOfStrings) {
		if (listOfStrings.isEmpty()) return "no inquisitiveness";
		int max = 0;
		for (String i : listOfStrings) {
			if (computeWithString(i) > max) {
				max = computeWithString(i);
			}
			else continue;
		}
		return listOfStrings.get(max);
	}
	

}
