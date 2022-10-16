public class Week4Work {
	
	public static int countCoke(String[] votes) {
		int cokeVotes = 0;
		for (String i : votes) {
			if (i.equals("Coke")) cokeVotes++;
		}
		return cokeVotes;
	}
	
	public static int [] evensOnly(int[] nums) {
		int evenSize = 0;
		for (int i: nums) {
			if (i%2 == 0) evenSize++;
		}
		
		int[] evenArr = new int[evenSize];
	
		int j = 0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]%2 == 0) {
				evenArr[j++] = nums[i];
			}
		}
		return evenArr;	
	}
	
	public static int countOctaveJumps(int[] notes) {
		int jumpCount = 0;
		
		for (int i=0; i<notes.length-1; i++) {
			if (2*notes[i] == notes[i+1]) jumpCount++;
		}
		return jumpCount;
	}
	
	public static int countPeaks(int[] listOfHeights) {
		int peakCount = 0;
		
		for(int i=1; i<listOfHeights.length-1; i++) {
			if (listOfHeights[i-1]<listOfHeights[i] && listOfHeights[i+1]<listOfHeights[i]) {
				peakCount++;
			}
		}
		return peakCount;
	}
	
	public static int manyWords(String[] listOfPhrases) {
		int result = 0;
		for (String i : listOfPhrases) {
			int numSpaces = 0;
			for (char c : i.toCharArray()) {
				if (c == ' ') numSpaces ++;
			}
			if (numSpaces >= 3) result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] cokeArr1 = new String[] {"Coke","Pepsi","Coke","Neither", "Mountain Dew"};
			// should return 2
		String[] cokeArr2 = new String[] {"coke","Pepsi","coke","Neither", "Mountain Dew"};
			// should return 0
		
		int[] nums1 = new int[] {3,8,19,4,20,32,15};
			// should return {8,4,20,32}
		int[] nums2 = new int[] {1,46,3,90,68,2,5};
			// should return {46,90,68,2}
		
		int[] octave1 = new int[] {440, 880, 600, 300, 475, 950, 1280, 1005, 2010};
			// should return 3
		int[] octave2 = new int[] {440, 870, 600, 300, 475, 950, 1280, 1005, 4020};
			// should return 1
		
		int[] peaks1 = new int[] {1250,900,2800,2600,3000,2500,1200,1900, 2108, 3500, 4200};
			// should return 2
		int[] peaks2 = new int[] {1250,900,2700,2600,3000,2500,1200,2200, 2108, 3500, 4200};
			// should return 3
		
		String[] phrases1 = new String[] {"Hello","Happy friday","coding is fun","   ","hi"}; 
			// should return 2
		String[] phrases2 = new String[] {" ","","  ","   ","    ","hi"};
			// should return 3
		
		System.out.println("Testing countCoke method:");
		System.out.println("cokeArr1 returned: "+countCoke(cokeArr1)+"; Expected: 2");
		System.out.println("cokeArr2 returned: "+countCoke(cokeArr2)+"; Expected: 0");
		System.out.println();
		
		System.out.println("Testing evensOnly method:");
		System.out.print("nums1 returned: {");
		for (int i : evensOnly(nums1)) {
			System.out.print(i+",");
		}
		System.out.print("}  Expected: {8,4,20,32}");
		System.out.println();
		
		System.out.print("nums2 returned: {");
		for (int i : evensOnly(nums2)) {
			System.out.print(i+",");
		}
		System.out.print("}  Expected: {46,90,68,2}");
		System.out.println();
		System.out.println();
		
		System.out.println("Testing countOctaveJumps method:");
		System.out.println("octave1 returned: "+countOctaveJumps(octave1)+"; Expected: 3");
		System.out.println("octave2 returned: "+countOctaveJumps(octave2)+"; Expected: 1");
		System.out.println();
		
		System.out.println("Testing countPeaks method:");
		System.out.println("peaks1 returned: "+countPeaks(peaks1)+"; Expected: 2");
		System.out.println("peaks2 returned: "+countPeaks(peaks2)+"; Expected: 3");
		System.out.println();
		
		System.out.println("Testing manyWords method:");
		System.out.println("phrases1 returned: "+manyWords(phrases1)+"; Expected: 2");
		System.out.println("phrases2 returned: "+manyWords(phrases2)+"; Expected: 3");
	}
}