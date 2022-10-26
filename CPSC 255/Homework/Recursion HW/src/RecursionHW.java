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
		if (n == 1) return 8;
		if (n == 2) return 6;
		else return (3*maporsky(n-2) + 2*maporsky(n-1));
	}
	
	/*
	 * determines if the keyword is in the list of words between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.   Check the left half of the list (with a recursive call) and check
	 * the right half of the list (with a recursive call).
	 */
	public static boolean contains(ArrayList<String> words, String keyword, int left, int right) {
		if (words.size() == 0) return false;
		else if (keyword.equals(words.get(left))) return true;
		else if (keyword.equals(words.get(right-1))) return true;
		else if (right-left == 1) return keyword.equals(words.get(0));

		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();

		for (int i=0; i<(words.size()+1)/2; i++) {
			a.add(words.get(i));
		}
		for (int i=a.size(); i<words.size(); i++) {
			b.add(words.get(i));
		}
		if (contains(a, keyword, left, a.size())) return true;
		else if (contains(b, keyword, 0, right/2)) return true;
		else return false;
	}
	/*
	 * determines the maximum number in the list of ints between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.  Determines the max of the numbers in positions left+1 .. right.   Then
	 * compares that result to the number in position  left, returning the max.
	 * If there is no data in the list, return -1000;  (Eventually, we will throw an Exception in this case.)
	 */
	public static int max(int[]  nums, int left, int right) {
		if (nums.length == 0) return -1000;
		if (right-left == 0) return -1000;
		else if (max(nums, left+1, right) > nums[left]) return max(nums, left+1, right);
		else return nums[left];
	}
	
	/*
	 * determines the sum of the numbers in the list between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.  Determines the sum of the numbers in positions left+1 .. right.   Then
	 * adds that result to the number in position  left, returning the total sum.
	 * If there is no data in the list, return 0;  
	 */
	public static int sumOf(int[] nums, int left, int right) {
		if (nums.length == 0) return 0;
		if (nums.length == 1) return nums[left];
		if (right-left == 0) return 0;
		int rtrSum = nums[left];
		rtrSum += sumOf(nums, left+1, right);
		return rtrSum;
	}
	
	/*
	 * determines the sum of the numbers in the list between positions left (inclusive) and
	 * right(exclusive).
	 * Uses a recursive algorithm.  Determines the sum of the numbers in the left half of the list and
	 * determines the sum of the numbers in the right half of the list, and adds those two results together.
	 * If there is no data in the list, return 0;  
	 */
	public static int totalOf(int[]  nums, int left, int right) {
		if (nums.length == 0) return 0;
		if (nums.length == 1) return nums[left];

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
		return (totalOf(a, left, a.length-1) + totalOf(b, 0, right));
	}
}
