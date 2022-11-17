import java.util.Random;
import java.util.Scanner;



public class TestBankLinkedList {

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		int howmanyTestCases = 8;
		for (int i = 1; i <= howmanyTestCases; i++)
		{
			FullerLinkedListOfAccounts bank = getTestCase(i);
			System.out.println("*********** TEST CASE # " + i + " ****************");
			runFunctions(bank);
			System.out.println("\n <----- Hit <Enter> to see the next test case ------->");
			String hitreturn = kbd.nextLine();
		}
		System.out.println("End of test cases.");
		kbd.close();

	}
	public static void runFunctions( FullerLinkedListOfAccounts bank)
	{
		System.out.println("The bank:");
		System.out.println(bank);
		System.out.println("The number of accounts is: " + bank.howManyAccounts());
		System.out.println("Total holdings: " + bank.totalHoldings());
		System.out.println("Total in savings: " + bank.totalSavings());
		System.out.println("Account number of joint account with highest balance:" + bank.largestJointAccount());
		System.out.println("Number of accounts with higher balance than one before it: " + bank.howManyLargerThanOneBefore());
		System.out.println("Capitalizing all owner names:");
		System.out.println(bank);
		Account accountToAdd = getRandomAccount();
		System.out.println("ADDING " + accountToAdd + " to the end of the list...");
		bank.insertAtEnd(accountToAdd);
		System.out.println("The new list:" + bank);
		System.out.println("REMOVING the second item from the list....");
		bank.removeSecond();
		System.out.println("The new list:" + bank);
	}
	


	public static FullerLinkedListOfAccounts getTestCase(int whichCase)
	{
		
		FullerLinkedListOfAccounts testcase = new FullerLinkedListOfAccounts();
		if (whichCase == 1)
		{
			testcase.insertAtBeginning(new Account("Jane",112,60.20));
			testcase.insertAtBeginning(new JointAccount("Bob",249,120.50,"Jerry"));
			testcase.insertAtBeginning(new SavingsAccount("Chris",101,984.35,5));
			testcase.insertAtBeginning(new Account("Jordan",260,187.50));
			testcase.insertAtBeginning(new Account("Tyler",109,20.50));
		}
		else if   (whichCase == 2)
		{
			testcase.insertAtBeginning(new Account("Terry",140,170.96));
			testcase.insertAtBeginning(new Account("Jordan",260,187.50));
			testcase.insertAtBeginning(new Account("Tyler",109,20.50));
			testcase.insertAtBeginning(new Account("Jane",112,60.20));
		}
		else if (whichCase == 3)
		{
			for (int count = 0; count < 25; ++ count)
			{
				Account acct = getRandomAccount();
				if (acct instanceof SavingsAccount)
					testcase.insertAtBeginning(acct);
			}
		}
		else if (whichCase == 4)
		{
			int howmany = 25;
			for (int count = 0; count < howmany; ++ count)
			{
				Account acct = getRandomAccount();
				acct.withdraw(acct.getBalance() - 1);
				acct.deposit(50 * (howmany -count));
				testcase.insertAtBeginning(acct);
			}
		}
		else if (whichCase == 5)
		{
			int howmany = 8;
			for (int count = 0; count < howmany; ++ count)
			{
				Account acct = getRandomAccount();
				acct.withdraw(acct.getBalance() - 0.01);
				acct.deposit(50 * count);
				testcase.insertAtBeginning(acct);
			}
		}
		else
		{
			Random rng = new Random();
			int howmany = rng.nextInt(20) + 5;
			for (int count = 0 ; count < howmany; ++ count)
			{
				testcase.insertAtBeginning(getRandomAccount());
			}
		}
		return testcase;
	}
	//***************
	private static Account getRandomAccount() {
		Random rng = new Random();
		int accountType = rng.nextInt(3);
		int accountNum = rng.nextInt(5000) + 500;
		double balance = (rng.nextInt(1000000) + 20) / 100.0;
		String[] names = {"Aziz","Shariq","Dejouvon","Tom","Lynette","George","Nancy","Gail","Parker","Logan","Austin","Porter",
				"Ruby","Ruth","Esther","Anne","Susan","Taylor","Yvonne","Charlie","Emerson","Cameron","Lalit","Atul",
				"Sheong","Taxiao","James","Courtney","Mohammed","Ryan"};
		int whichname = rng.nextInt(names.length);
		String owner = names[whichname];
		if (accountType == 0)
		{
			return new Account(owner,accountNum,balance);
		}
		if (accountType == 1)
		{
			int nextIndex = ( whichname + rng.nextInt(names.length - 2)) % names.length;
			String owner2 = names[nextIndex];
			return new JointAccount(owner,accountNum,balance,owner2);
		}
		if (accountType == 2)
		{
			double interest = rng.nextInt(75)/10.0;
			return new SavingsAccount(owner,accountNum,balance,interest);
		}
		return null; // should not get here
	}
}
