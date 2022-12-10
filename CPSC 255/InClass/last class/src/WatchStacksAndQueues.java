
public class WatchStacksAndQueues {

	public static void main(String[] args) {
		String [] phrases = {"Once upon a midnight dreary, while I pondered weak and weary", 
				"Four Score and Seven Years ago, our fathers brought forth on this continent",
				"Ask not what your country can do for you - ask what you can do for your country.",
				"Frosty the Snowman was a jolly happy soul",
				"Baruch atah Adonai Eloheinu Melech ha-olam, asher kid'shanu b-mitzvotav, v-tzivanu l'hadlik ner shel Hanukkah",
				"And there were sheperds residing in the fields",
				"Dasher, Dancer, Prancer and Vixen. Comet, Cupid, Donner, and Blitzen",
				"Rudolph"
		};

		// partA(phrases);
		// partB(phrases);
		// partC(phrases);
		// partD(phrases);
		// partE(phrases);
		// partF(phrases);
		partG(phrases);
	}
//************************
	private static void partA(String[] phrases) {
		System.out.println("------------- PART A --------------------");
		for (String s: phrases)
		{
			System.out.println("\nWorking with: " + s);
			String[] tokens = s.split(" ");
			StackOfStrings aStack = new StackOfStrings();
			for (String token: tokens)
				aStack.push(token);
			
			while (! aStack.empty())
			{
				System.out.println(aStack.top());
				aStack.pop();
			}
			
		}
		
	}

	//************************
		private static void partB(String[] phrases) {
			System.out.println("------------- PART B --------------------");
			for (String s: phrases)
			{
				System.out.println("\nWorking with: " + s);
				String[] tokens = s.split(" ");
				QueueOfStrings aQueue = new QueueOfStrings();
				for (String token: tokens)
					aQueue.enQ(token);
				
				while (! aQueue.empty())
				{
					System.out.println(aQueue.front());
					aQueue.deQ();
				}
				
			}
			
		}
		
		//************************
		private static void partC(String[] phrases) {
			System.out.println("------------- PART C --------------------");
			for (String s: phrases)
			{
				System.out.println("\nWorking with: " + s);
				String[] tokens = s.split(" ");
				StackOfStrings aStack = new StackOfStrings();
				QueueOfStrings aQueue = new QueueOfStrings();
				for (int pos = 0; pos < tokens.length/2; ++pos)
					aStack.push(tokens[pos]);
				for (int pos =  tokens.length/2; pos< tokens.length; ++pos)
					aQueue.enQ(tokens[pos]);
				
				while (! aStack.empty())
				{
					System.out.println(aStack.top());
					aStack.pop();
				}
				while (! aQueue.empty())
				{
					System.out.println(aQueue.front());
					aQueue.deQ();
				}
				
			}
			
		}
		
		//************************
		private static void partD(String[] phrases) {
			System.out.println("------------- PART D --------------------");
			for (String s: phrases)
			{
				System.out.println("\nWorking with: " + s);
				String[] tokens = s.split(" ");
				StackOfStrings aStack = new StackOfStrings();
				QueueOfStrings aQueue = new QueueOfStrings();
				for (int pos = tokens.length-1; pos > 0; --pos)
					aStack.push(tokens[pos]);
				for (int pos =  tokens.length/2; pos< tokens.length; ++pos)
					aQueue.enQ(tokens[pos]);
				

				while (! aQueue.empty())
				{
					System.out.println(aQueue.front());
					aQueue.deQ();
				}
				while (! aStack.empty())
				{
					System.out.println(aStack.top());
					aStack.pop();
				}
				
			}
			
		}
		
		//************************
		private static void partE(String[] phrases) {
			System.out.println("------------- PART E --------------------");
			for (String s: phrases)
			{
				System.out.println("\nWorking with: " + s);
				String[] tokens = s.split(" ");
				StackOfStrings aStack = new StackOfStrings();
				QueueOfStrings aQueue = new QueueOfStrings();
				boolean goInStack = true;
				for (String token: tokens)
				{
					if (goInStack)
						aStack.push(token);
					else
						aQueue.enQ(token);
					goInStack = ! goInStack;    // alternate
				}
				

				while (! aQueue.empty())
				{
					System.out.println(aQueue.front());
					aQueue.deQ();
				}
				while (! aStack.empty())
				{
					System.out.println(aStack.top());
					aStack.pop();
				}
				
			}
			
		}
		
		//************************
		private static void partF(String[] phrases) {
			System.out.println("------------- PART F --------------------");
			for (String s: phrases)
			{
				System.out.println("\nWorking with: " + s);
				String[] tokens = s.split(" ");
				StackOfStrings aStack = new StackOfStrings();
				QueueOfStrings aQueue = new QueueOfStrings();
				boolean goInStack = false;
				for (String token: tokens)
				{
					if (goInStack)
						aStack.push(token);
					else
						aQueue.enQ(token);
					goInStack = ! goInStack;    // alternate
				}
				
				while (!aQueue.empty() && ! aStack.empty()) {
					if (! aStack.empty())
					{
						System.out.println(aStack.top());
						aStack.pop();
					}
					if (! aQueue.empty())
					{
						System.out.println(aQueue.front());
						aQueue.deQ();
					}
						
				}
				
				
			}
			
		}
		
		//************************
		private static void partG(String[] phrases) {
			System.out.println("------------- PART G --------------------");
			for (String s: phrases)
			{
				System.out.println("\nWorking with: " + s);
				String[] tokens = s.split(" ");
				StackOfStrings aStack = new StackOfStrings();
				for (int pos = 0 ; pos < tokens.length; pos+=2)
				{
					aStack.push(tokens[pos]);
					if (pos +1 < tokens.length)
						aStack.push(tokens[pos+1]);
					aStack.pop();
					
				}
				while (! aStack.empty())
				{
					System.out.println(aStack.top());
					aStack.pop();
				}
				
				
			}
			
		}
}
