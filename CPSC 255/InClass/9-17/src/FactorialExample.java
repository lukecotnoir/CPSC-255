/*  Simple demo program for inclass.   Started by Scott McElfresh
 * 
 */

import javax.swing.JOptionPane;

public class FactorialExample {

	// compute n! with an iterative loop
	public static int factorial(int n)
	{
		int prod = 1;
		for (int x = 1; x <= n; ++x)
			prod = prod * x;
		return prod;
	}
	
	// compute n! with recursion
	public static int factorialR(int n)
	{
		if (n == 0)
			return 1;
		else
			return n * factorialR(n-1);
	}
	
	// The main program.
	public static void main(String[] args) {

		int n = 0;
		while (n >= 0) {
			String userinput = JOptionPane.showInputDialog("Enter n");
			n = Integer.parseInt(userinput);
			if (n >=0)
				System.out.println(n + "! = " + factorialR(n));
		}

	}

}
