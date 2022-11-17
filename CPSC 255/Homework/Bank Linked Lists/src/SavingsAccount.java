// hold info on Savings Accounts.  Inherits all functionalities of accounts (like withdraw and
// deposit).  Also has interest rates, and can add interest.
// written by Scott McElfresh

public class SavingsAccount extends Account 
{
   public double myinterestRate;  // eg.  2.5 = 2.5%
   
   //******
   public SavingsAccount(String owner, int number, double deposit)
   {
      super(owner,number,deposit);
      myinterestRate = 0;
   }
   
   //******
   public SavingsAccount(String owner, int number, double deposit, double intRate)
   {
      super(owner,number,deposit);
      myinterestRate = intRate;
   }

   // adds the yearly interest
   public void addInterest()
   {
      double interestAmount = myinterestRate /100 * getBalance();
      deposit(interestAmount);
   }



// display basic account info.  Then display the interest rate.
  public void display()
  {
     super.display();
     System.out.println("Interest rate: " + myinterestRate + "%");
  }
  
  // override
  public String toString()
  {
	   return super.toString() + ", Interest rate:" + myinterestRate + "%";
  }
  
}