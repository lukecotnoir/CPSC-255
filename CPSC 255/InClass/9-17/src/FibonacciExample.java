/*  Simple demo program for inclass.   Started by Scott McElfresh
 * 
 */

import javax.swing.JOptionPane;

public class FibonacciExample {

	// compute n! with an iterative loop

	
	// compute n'th Fibonacci number where the sequence starts with 1 and 1
	public static int fibonacci(int n)
	{
		if (n == 1)
			return 1;
		else
			if (n == 2)
				return 1;
			else
				return fibonacci(n-1) + fibonacci(n-2);
		
	}
	
	// The main program.
	public static void main(String[] args) {

		int n = 1;
		while (n >= 1) {
			String userinput = JOptionPane.showInputDialog("Enter n");
			n = Integer.parseInt(userinput);
			if (n >=1)
				System.out.println(n + "'st Fibonacci number is: " + fibonacci(n));  // awkward English
		}

	}

}
