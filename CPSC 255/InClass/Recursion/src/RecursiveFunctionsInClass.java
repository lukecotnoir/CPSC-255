import java.util.ArrayList;

// some functions used for in-class exercise
public class RecursiveFunctionsInClass {
	
	/*  Return the n'th Kirsky number as defined below:
	 *  Kirky numbers are defined n integer >=1
	 *  kirsky(1) = 6
	 *  kirsky(2) = 3
	 *  kirsky(3) = 4
	 *  For n>3, kirsky(n) is the sum of the number three places before it, the number 2 places before it
	 *  and two times the number one place before it.
	 *  Thus, for instance, kirsky(4) = 6 + 3 + 2*4 = 17
	 *                      kirsky(5) = 3 + 4 + 2*17 = 41
	 *                      etc.
	 *  If n <=0, this function should return -19.   (Eventually, we will throw an Exception in this case.)
	 *  Function uses recursion to do the calculation.
	 * 
	 */
	public static int kirsky(int n) {
		if (n == 1) return 6;
		if (n == 2) return 3;
		if (n == 3) return 4;
		else return (kirsky(n-3) + kirsky(n-2) + 2*(kirsky(n-1)));
	}
	
	/*
	 * determines if the keyword is in the list of words between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.   It first checks the item in position left, and if not there, checks
	 * the items in the rest of the list (positions left+1 .. right)
	 */
	public static boolean contains(ArrayList<String> words, String keyword, int left, int right) {
		if (words.size() == 0) return false;
 		if (keyword.equals(words.get(left))) return true;
		else if (right-left == 1) return false;
		else return (contains(words, keyword, left+1, right));
	}

	/*
	 * determines the maximum number in the list of ints betweenpositions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.  Determines the max of the numbers in the left half of the list and
	 * the max of the numbers in the right half of the list, and compares them.
	 * If there is no data in the list, return -1000;  (Eventually, we will throw an Exception in this case.)
	 */
	public static int max(int[]  nums, int left, int right) {
		if (nums.length == 0) return -1000;
		if (nums.length == 1) return nums[0];

		int[] a = new int[(nums.length + 1)/2];
        int[] b = new int[nums.length - a.length];
 
        for (int i = 0; i < nums.length; i++)
        {
            if (i < a.length) {
                a[i] = nums[i];
            }
            else {
                b[i - a.length] = nums[i];
            }
        }
		
		if (max(a, left, a.length-1) > max(b, 0, right)) return max(a, left, a.length-1);
		else return max(b, 0, right);
		
	}
}
