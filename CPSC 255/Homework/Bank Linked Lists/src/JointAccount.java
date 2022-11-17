// class to allow all functionalites of an account (such as deposit and
// withdrawal, plus allow for two owners.
// written by Scott McElfresh



public class JointAccount extends Account
{
   public String mysecondOwner;
   
   //************
   public JointAccount(String owner, int number, double deposit, String owner2)
   {
      /*mynumber = number;
      mybalance = deposit;
      myowner = owner;
      */
	  super(owner,number,deposit);
      mysecondOwner = owner2;
   }

   //******
   // display the info on the account
   // OVERRIDE the display  method from the superclass
   public void display()
   {
     /*System.out.println("Owner: " + myowner);
     System.out.println("Account #: " + mynumber);
     System.out.println("Balance: " + mybalance);
     */
	 super.display();
     System.out.println("Second Owner: " + mysecondOwner);
   }
   
   // override
   public String toString()
   {
	   return super.toString() + "," +mysecondOwner;
   }
   
   
   

}