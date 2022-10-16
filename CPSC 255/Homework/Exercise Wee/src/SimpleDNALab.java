
public class SimpleDNALab {
	public static boolean skewed(String oneStrand) {
		int numA=0, numT=0;
		
		for (int i=0; i<oneStrand.length(); i++) {
			if (oneStrand.charAt(i) == 'A') numA++;
			else if (oneStrand.charAt(i) == 'T') numT++;
		}
		return (numA>numT);
	}
	
	public static int howManySkewed(String[] listOfStrands) {
		int count = 0;
		for (String i : listOfStrands) {
			if (skewed(i)) count++;
		}
		return count;
	}
	
	public static boolean firstOnesLonger(String[] firstList, String[] secondList) {
		if (firstList.length != secondList.length) return false;
		
		for (int i=0; i<firstList.length; i++) {
			if (firstList[i].length() > secondList[i].length())
				continue;
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String strand1 = "ATCGCCTTAACA"; //skewed
		String strand2 = "ATTCTTACTCAA"; //not skewed
		String strand3 = "AAATTGCCGGTTTTA"; //not skewed
		String strand4 = "AAAATAAGGCAACA"; //skewed
		
		String[] listOfStrands = new String[] {strand1, strand2, strand3, strand4}; 	 // 2 skewed
		String[] listOfStrands2 = new String[] {"TTT", "AAA", "TAA", "AAATA"}; 			 // 3 skewed
		String[] listOfStrands3 = new String[] {"cAT", "dog", "TorTure", "AAAAAh"}; 	 // 1 skewed
		String[] listOfStrands4 = new String[] {"docTor", "mcelfresh", "is", "AmAzing"}; // 1 skewed
		
		
		System.out.println("Testing skewed method...");
		if (skewed(strand1)) 
			System.out.println("passed test 1: ATCGCCTTAACA should return skewed");
		else System.out.println("failed test 1: ATCGCCTTAACA should return skewed");
		
		if (!skewed(strand2)) 
			System.out.println("passed test 2: ATTCTTACTCAA should return skewed");
		else System.out.println("failed test 2: ATTCTTACTCAA should return skewed");
		
		if (!skewed(strand3)) 
			System.out.println("passed test 3: AAATTGCCGGTTTTA should return skewed");
		else System.out.println("failed test 3: AAATTGCCGGTTTTA should return skewed");
	
		if (skewed(strand4)) 
			System.out.println("passed test 4: AAAATAAGGCAACA should return skewed");
		else System.out.println("failed test 4: AAAATAAGGCAACA should return skewed");
		
		System.out.println("");
		
		System.out.println("Testing howManySkewed method...");
		if (howManySkewed(listOfStrands)==2) 
			System.out.println("passed test 1: listOfStrands should return 2");
		else System.out.println("failed test 1: listOfStrands should return 2");
		
		if (howManySkewed(listOfStrands2)==3) 
			System.out.println("passed test 2: listOfStrands2 should return 3");
		else System.out.println("failed test 2: listOfStrands should return 3");
		
		if (howManySkewed(listOfStrands3)==1) 
			System.out.println("passed test 1: listOfStrands3 should return 1");
		else System.out.println("failed test 1: listOfStrands3 should return 1");
		
		if (howManySkewed(listOfStrands4)==1) 
			System.out.println("passed test 4: listOfStrands4 should return 1");
		else System.out.println("failed test 4: listOfStrands4 should return 1");
		
		System.out.println("");
		
		System.out.println("Testing firstOnesLonger method...");
		if (firstOnesLonger(listOfStrands, listOfStrands2))
			System.out.println("passed test 1: listOfStrands vs. listOfStrands2 should return true");
		else System.out.println("failed test 1: listOfStrands vs. listOfStrands2 should return true");
		
		if (firstOnesLonger(listOfStrands, listOfStrands3))
			System.out.println("passed test 2: listOfStrands vs. listOfStrands3 should return true");
		else System.out.println("failed test 2: listOfStrands vs. listOfStrands3 should return true");
		
		if (!firstOnesLonger(listOfStrands3, listOfStrands4))
			System.out.println("passed test 3: listOfStrands3 vs. listOfStrands4 should return false");
		else System.out.println("failed test 3: listOfStrands3 vs. listOfStrands4 should return false");
		
	}

}
