/* Class to hold info on a bank account. It can handle deposits, withdraws, and 
   displays
   written by Scott McElfresh
*/
public class Account 
{
   private  int mynumber;
   private  double mybalance;
   private  String myowner;
   // default constructor, sets things to 0 or empty
   public Account()
   {
      mynumber = 0;
      setMybalance(0);
      myowner = "";
   }
   //******
   public Account(String owner, int number, double deposit)
   {
      mynumber = number;
      setMybalance(deposit);
      myowner = owner;
   }
    //******
    // assumes no deposit
   public Account(String owner, int number)
   {
      mynumber = number;
      setMybalance(0);
      myowner = owner;
   }
   //******
   // display the info on the account
   public void display()
   {
     System.out.println("Owner: " + myowner);
     System.out.println("Account #: " + mynumber);
     System.out.println("Balance: $" + getMybalance());
   }
   //******
   // deposit the amount.
   public void deposit(double amount)
   {
       setMybalance(getMybalance() + amount);
   }
   //******
   // withdraw, doing check that enough money is in account
   public void withdraw(double amount)
   {
       if (amount >= getMybalance())
          System.out.println("ERROR: CAN NOT WITHDRAW THAT MUCH MONEY.");
       else
         setMybalance(getMybalance() - amount);
   }
   public String toString() {
	   return myowner + ",#" + mynumber + ",$"+ getMybalance();
   }
   // What else is missing?
   
   public double getMybalance() {
	   return mybalance;
   }
   public void setMybalance(double mybalance) {
	   this.mybalance = mybalance;
   }
}