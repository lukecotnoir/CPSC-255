import java.util.ArrayList;

public class StaticFunctionsTester {


	public static void main(String[] args) {
		System.out.println("    !!!!! This program runs some tests on the StaticFunctions Functions. !!!!");
		System.out.println("    !!!!! This tester is not complete, and you are welcome to modify it.!!!!");
		System.out.println();
		System.out.println("Your password is: " + StaticFunctions.getPassword());
		testGetReception();

		testComputeWithString();
		testMeasureInquisitiveness();
		
		ArrayList<String> data = StaticFunctions.getSomeData();
		System.out.println("\n*** Testing getSomeData:***" );
		System.out.println("result:" + data);
		System.out.println("\n*** Testing mostInquisitivness:***" );
		
		testMostInquisitiveness();
		
		

		
		

	}
	
	private static void testOneComputeWithString(String input1) {
		System.out.println("For \"" + input1 + "\" the result is " + StaticFunctions.computeWithString(input1));

	
	}

	
	private static void testComputeWithString() {
		System.out.println("\n ** Testing the computeWithString function: **");
		String [] inputs = {"Ready???", "Good Morning! How are you?", "Is today Friday? How soon?",	
				"Exam"
				};
		for (String s1: inputs)
					testOneComputeWithString(s1);
	}
	
	private static void testOneInputMeasureInquisitiveness(String[] listOfStrings)	
	{
		int answer = StaticFunctions.measureInquisitiveness(listOfStrings);
		System.out.println("Finds " + answer + " inquisitiveness in the list:");
		printArrayOfStrings(listOfStrings);
		System.out.println();
	}

	private static void testMeasureInquisitiveness() {
		System.out.println("\n ** Testing the measureInquisitiveness function: **");
		String [][] testCases = {
				{"Really???", "Good Morning! How are you?", "Is today Wednesday?","When??"},
				{},
				{"Exam"},
				};
	
		for (String [] testcase : testCases)
			testOneInputMeasureInquisitiveness(testcase);
	}
	
	private static void printArrayOfInts(int [] data) {
		System.out.print("[");
		for (int item: data) {
			System.out.print(item);
			if ( item !=data[data.length-1])
					System.out.print(",");
		}
		System.out.print("]");
	}
	
	private static void testOneReception(String genre, int view)
	{
		System.out.println("For " + genre + " show  with  rating" + view + ": " + StaticFunctions.getReception(genre, view));
	}
	private static void testGetReception()
	{
		System.out.println("\n ** Testing GetReception **");
		String genre1 = new String("Comedy");
		String genre2 = new String("Horror");
		String genre3 = new String("SuperHero");
		testOneReception(genre1, 40);
		testOneReception(genre1, 10);
		testOneReception(genre2, 6);
		testOneReception(genre2, 45);
		testOneReception(genre3, 50);
		testOneReception(genre3, 135);
	}
	

	
	
	
	private static void printArrayOfStrings(String [] listOfStrings) {
		System.out.print("[");
		for (String item: listOfStrings) {
			System.out.print(item);
			if (! item.equals(listOfStrings[listOfStrings.length -1]))
					System.out.print(",");
		}
		System.out.print("]");
	}
	
	private static void testMostInquisitiveness() {
		ArrayList<String> data = StaticFunctions.getSomeData();
		System.out.println(StaticFunctions.mostInquisitive(data));
	}
	
	
	
}
