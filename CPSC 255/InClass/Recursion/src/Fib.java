// a class to have one static method - to calculate Fibonacci numbers.
// used as inclass exercise
public class Fib {

	private static int functionCalls = 0;
	
	// compute n'th Fibonacci number where the sequence starts with 1 and 1 in positions 1 and 2.
	public static int fibonacci(int n)
	{
		++ functionCalls;
		if (n == 1)
			return 1;
		if (n == 2)
				return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}

	// 
	public static void resetCallsCounter()
	{
		functionCalls = 0;
	}
	
	// 
	public static int howManyFunctionCalls()
	{
		return functionCalls;
	}
}

