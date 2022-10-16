// class to allow all functionalites of an account (such as deposit and
// withdrawal, plus allow for two owners.
// written by Scott McElfresh



public class JointAccount extends Account {
   public String mysecondOwner;
   

   public JointAccount(String owner, int number, double deposit, String owner2) {
      super(owner, number, deposit);
      mysecondOwner = owner2;
   }

   //******
   // display the info on the account
   public void display() {
     super.display();
     System.out.println("Second Owner: " + mysecondOwner);
   }

}