import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestRecursionHW {

	public static void main(String[] args) {
		// testMaporsky();
		// System.out.println("---------------------------------");
		testContains();
		// System.out.println("---------------------------------");
		// testMax();
		// System.out.println("---------------------------------");
		// testSumOf();
		// System.out.println("---------------------------------");
		// testTotalOf();
				

			}

	private static void testTotalOf() {
		int[] [] testcases = {{4,5,6,7,8,9,10},{19,100,40,8},{78},{102,900,87,65,43,80,92,56,78,65,1026},{78,50},{45,90},
				{804,499,902,65,83,92,401,97,89,67,54,84,365,43,901,80},
				{804,499,65,83,92,401,97,89,67,54,84,365,43,901,80}
		};
		for (int[] onecase : testcases)
		{
			int answer = RecursionHW.totalOf(onecase, 0, onecase.length);
			System.out.print(answer + " is the total of the numbers in: ");
			printArrayOfInts(onecase);
			System.out.println();
		}
		
	}

	private static void testSumOf() {
		int[] [] testcases = {{4,5,6,7,8,9,10},{19,100,40,8},{78},{102,900,87,65,43,80,92,56,78,65,1026},{78,50},{45,90},
				{804,499,902,65,83,92,401,97,89,67,54,84,365,43,901,80},
				{804,499,65,83,92,401,97,89,67,54,84,365,43,901,80}
		};
		for (int[] onecase : testcases)
		{
			int answer = RecursionHW.sumOf(onecase, 0, onecase.length);
			System.out.print(answer + " is the sum of the numbers in: ");
			printArrayOfInts(onecase);
			System.out.println();
		}
	}

	//---------------------------------------------------------------
	private static void testMax() {
		int[] [] testcases = {{4,5,6,7,8,9,10},{19,100,40,8},{78},{102,900,87,65,43,80,92,56,78,65,1026},{78,50},{45,90},
				{804,499,902,65,83,92,401,97,89,67,54,84,365,43,901,80},
				{804,499,65,83,92,401,97,89,67,54,84,365,43,901,80}
		};
		for (int[] onecase : testcases)
		{
			int answer = RecursionHW.max(onecase, 0, onecase.length);
			System.out.print(answer + " is the max of the numbers in: ");
			printArrayOfInts(onecase);
			System.out.println();
		}
		
	}


	//-----------------------------------------------------------------------
	private static void testContains() {
		System.out.println("----------------------------");
		String [] info1 = {"apple","banana","peach","mango","pear","strawberry","kiwi","guava"};
		String [] info2 = {"papaya","grape","cherry","orange","lemon","lime"};
		String[] lookfor = {"apple","banana","grapefruit","lemon","guava","pear","honeydew"};
		ArrayList<String> words1 = new ArrayList<String>();
		for (String s: info1)
			words1.add(s);
		ArrayList<String> words2 = new ArrayList<String>();
		for (String s: info2)
			words2.add(s);
		for (String s : lookfor)
		{
			if (RecursionHW.contains(words1,s,0,words1.size()))
				System.out.println(s + " was found in " + words1);
			else
				System.out.println(s + " was NOT found in " + words1);	
		}
		for (String s : lookfor)
		{
			if (RecursionHW.contains(words2,s,0,words2.size()))
				System.out.println(s + " was found in " + words2);
			else
				System.out.println(s + " was NOT found in " + words2);	
		}
		ArrayList<String> words3 = new ArrayList<String>();
		for (String s : lookfor)
		{
			if (RecursionHW.contains(words3,s,0,words3.size()))
				System.out.println(s + " was found in " + words3);
			else
				System.out.println(s + " was NOT found in " + words3);	
		}
		ArrayList<String> words4 = new ArrayList<String>(words1);
		words4.addAll(words2);

		for (String s : lookfor)
		{
			if (RecursionHW.contains(words4,s,0,words4.size()))
				System.out.println(s + " was found in " + words4);
			else
				System.out.println(s + " was NOT found in " + words4);	
		}

		
	}

	
			private static void testMaporsky() {
				String userinput = JOptionPane.showInputDialog("How many Maporsky numbers do you want? ");
				int howmany = Integer.parseInt(userinput);
				for (int num =1 ; num <= howmany; ++num) {
					System.out.println(num + "'th Maporsky number is: " + RecursionHW.maporsky(num));  // awkward English
				}	
			}
		

			// pretty print an array
			public static void printArrayOfInts(int[] nums)
			{
				System.out.print("[");
				for (int pos = 0; pos < nums.length;pos++)
				{
					System.out.print(nums[pos]);
					if (pos !=  nums.length - 1 )
						System.out.print(",");
				}
				System.out.print("]");
			}

}




