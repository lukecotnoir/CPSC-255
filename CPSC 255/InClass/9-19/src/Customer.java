/*  This class records info for a customer of electricity.  Residential
and business customers have different per hour rates.

written by Scott McElfresh

*/

public class Customer 
{
    
    private String myName;
    private int myHours;
    private double myRate;
    
    //****
    // constructor for  no usage yet.  "Residential" is 60 cents.  all others are 40 cents.
     public Customer (String name, String typeOfService)
     {
       myName = name;
       if (typeOfService.equals( "Residential"))
      		myRate = 0.60;
       else
       		myRate = 0.40;
       myHours = 0;
     }

   //****
   // method to indicate that the person has used some electricity
   public void useHours(int h)
   {
       myHours = myHours + h;
   }

    //****
    // displays the customer's name, rate, hours used and total bill
    public void display()
    {
        System.out.print(myName + " used " + myHours + " hours at " + myRate);
		System.out.print(" each, totalling: " + totalCost() + ".");
		System.out.println();
    }
    
    //*******
    // compute and return the total cost thus far
    private double totalCost()
    {
       return myHours*myRate;
    }
    
    public String toString() {
    	return myName + "hours used: " + myHours + " rate: " + myRate;
    }
    
}