import javax.swing.JOptionPane;

public class FibRunner {
	
	public static void main(String[] args) {

		int n = 1;
		while (n >= 1) {
			String userinput = JOptionPane.showInputDialog("Enter n");
			n = Integer.parseInt(userinput);
			if (n >=1) {
				Fib.resetCallsCounter();
				System.out.println(n + "'st Fibonacci number is: " + Fib.fibonacci(n));  // awkward English
				System.out.println(Fib.howManyFunctionCalls() + " function calls were used to calcuate it.");
				System.out.println();
			}
		}

	}
}
	