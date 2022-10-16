import java.util.ArrayList;

// demo program
public class WorkWithAccountLists 
{     
	public static void main(String[] args) 
    {
		Account a1 = new Account("Scott",105,45.60);
		JointAccount a2 = new JointAccount("Scott",106,70.30,"Sarah");
		SavingsAccount a3 = new SavingsAccount("Scott",107,50,2.5);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	
		 ArrayList<Account> theBank = new ArrayList<Account>();
		 theBank.add(a1);
		 theBank.add(a2);
		 theBank.add(a3);
		 
		 displayList(theBank);
		 
		
		
		System.out.println("The total balance is: $" + getTotalFunds(theBank));
		
		 
		
		addInterest(theBank);
		System.out.println("-----------------------");
		System.out.println("After interest added:");
		displayList(theBank);
		
  }
	//*******
private static void addInterest(ArrayList<Account> theBank) {
		for (Account acct : theBank) {
			if (acct instanceof SavingsAccount) {
			((SavingsAccount)acct).addInterest();
			}
		}
	}
//****
	private static double getTotalFunds(ArrayList<Account> theBank) {
		return 0;
	}
//*****
	private static void displayList(ArrayList<Account> theBank) {
		for (Account acct: theBank)
			System.out.println(acct);
		
	}
}