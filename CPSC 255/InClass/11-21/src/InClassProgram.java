import java.util.ArrayList;
import java.util.Scanner;

public class InClassProgram {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int howmanyTestCases = 5;
		for (int i = 1; i <= howmanyTestCases; i++)
		{
			System.out.println("*********** TEST CASE # " + i + " ****************");

			runFunctions(i);
			System.out.println("\n <----- Hit <Enter> to see the next test case ------->");
			String hitreturn = kbd.nextLine();
		}
		System.out.println("End of test cases.");
		kbd.close();

	}
	
	public static void runFunctions( int i)
	{
		ArrayList<String> testdata = getTestCase(i);
		System.out.println("This is the arrayList: " + testdata);
		LinkedListOfStringWithMore thelist = new LinkedListOfStringWithMore(testdata);
		System.out.println("The contents of the linked list version:");
		System.out.println(thelist);
		System.out.println();
		System.out.println("Here is an ArrayList of the 'long' strings:" + thelist.longStrings());
		System.out.println();
		System.out.println("Here is the contents of the linked list that holds the 'long' strings:" );
		LinkedListOfStringWithMore answer = thelist.theLongStrings();
		System.out.println(answer);
		System.out.println();
		System.out.println("For checking, be certain that the long strings are in each list and that they are in the same order.");
		
	}
	
	
	/*

	
	 * get an ArrayList of test data
	 */
	private static ArrayList <String> getTestCase(int which)
	{
		ArrayList<String> toreturn = new ArrayList<String>();
		String[] data = getTestCaseArray(which);
		for (String s: data)
			toreturn.add(s);
		return toreturn;
	}
	/*
	 * get an array of test data
	 */
	private static String [] getTestCaseArray(int which){

		if (which == 1)
		{
			String[] data = {"Fred","Ted","Mary","Christine","Christopher","Tyler","Taylor"};
			return data;
		}
		if (which == 2) 
		{
			String[] data = {"Johnson","Smith","Lee","Williams","Thompson","Jones","Harris","Hudson","Moss","Brady","Timpkins"};
			return data;
		}
		if (which == 3)
		{
			String[] data = {"apple","pear","peach","kiwi"};
			return data;
		}	
		if (which == 4)
		{
			String[] data = {};
			return data;
		}
		String[] data = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		return data;
	}

}
