import java.text.DecimalFormat;

/* Class to hold info on a bank account. It can handle deposits, withdraws, and 
   displays
   written by Scott McElfresh
*/
public class Account 
{
   private  int mynumber;  // protected means this class AND subclasses
   private  double mybalance;
   private  String myowner;
   // default constructor, sets things to 0 or empty
   public Account()
   {
      mynumber = 0;
      mybalance = 0;
      myowner = "";
   }
   //******
   public Account(String owner, int number, double deposit)
   {
      mynumber = number;
      mybalance = deposit;
      myowner = owner;
   }
    //******
    // assumes no deposit
   public Account(String owner, int number)
   {
      mynumber = number;
      mybalance = 0;
      myowner = owner;
   }
   //******
   // display the info on the account
   public void display()
   {
     System.out.println("Owner: " + myowner);
     System.out.println("Account #: " + mynumber);
     System.out.println("Balance: $" + mybalance);
   }
   //******
   // deposit the amount.
   public void deposit(double amount)
   { 
       mybalance += amount;
   }
   
 //******
   // withdraw, doing check that enough money is in acccount
   public void withdraw(double amount)
   {
       if (amount >= mybalance)
          System.out.println("ERROR: CAN NOT WITHDRAW THAT MUCH MONEY.");
       else
         mybalance -= amount;
   }
   public String toString() {
	   return myowner + ",#" + mynumber + ",$"+ new DecimalFormat("0.00").format(mybalance);
   }

   /**
 * @return the myowner
 */
public String getOwner() {
	return myowner;
}
/**
 *
 * @param myowner the myowner to set
 */
public void setOwner(String myowner) {
	this.myowner = myowner;
}
/**
 * @return the mynumber
 */
public int getNumber() {
	return mynumber;
}
/**
 * @return the mybalance
 */
public double getBalance() {
	return mybalance;
}

}