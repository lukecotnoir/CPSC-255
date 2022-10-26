import java.util.ArrayList;

// some functions used for in-class exercise
public class RecursionHW {
	
	/*  Return the n'th Maporsky number as defined below:
	 *  Maporsky numbers are defined for n integer >=1
	 *  Maporsky(1) = 8
	 *  Maporsky(2) = 6

	 *  For n>2, Maporsky(n) is three times the number two places before plus two times the number one place before it.
	 *  Thus, for instance, Maporsky(3) = 3*8 + 2*6 = 36
	 *                      Maporsky(4) = 3*6 + 2*36 = 90
	 *                      etc.
	 *  If n <=0, this function should return -19.   (Eventually, we will throw an Exception in this case.)
	 *  Function uses recursion to do the calculation.
	 * 
	 */
	public static int maporsky(int n) {
		return -19;  // placeholder. 
	}
	
	/*
	 * determines if the keyword is in the list of words between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.   Check the left half of the list (with a recursive call) and check
	 * the right half of the list (with a recursive call).
	 */
	public static boolean contains(ArrayList<String> words, String keyword, int left, int right) {
		return false; // placeholder
	}

	/*
	 * determines the maximum number in the list of ints between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.  Determines the max of the numbers in positions left+1 .. right.   Then
	 * compares that result to the number in position  left, returning the max.
	 * If there is no data in the list, return -1000;  (Eventually, we will throw an Exception in this case.)
	 */
	public static int max(int[]  nums, int left, int right) {
		return -90;// placeholder
	}
	
	/*
	 * determines the sum of the numbers in the list between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.  Determines the sum of the numbers in positions left+1 .. right.   Then
	 * adds that result to the number in position  left, returning the total sum.
	 * If there is no data in the list, return 0;  
	 */
	public static int sumOf(int[]  nums, int left, int right) {
		return -90;// placeholder
	}
	
	/*
	 * determines the sum of the numbers in the list between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.  Determines the sum of the numbers in the left half of the list and
	 * determines the sum of the numbers in the right half of the list, and adds those two results together.
	 * If there is no data in the list, return 0;  
	 */
	public static int totalOf(int[]  nums, int left, int right) {
		return -90;// placeholder
	}
}
