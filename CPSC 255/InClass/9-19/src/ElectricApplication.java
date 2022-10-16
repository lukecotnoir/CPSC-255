/*
	This silly program declares two electric customers, setting their rates
	and their usage.  Their total bill is then displayed.
	
	written by Scott McElfresh
*/

public class ElectricApplication 
{

  
	public static void main(String args[]) 
	{
		Customer cust1 = new Customer("Harry Jones","Residential"); // sets name to
					// Harry Jones, with no usage and the residential rate (60cents)

		Customer cust2 = new Customer("Mary Smith", "Business"); // sets name to
					// Mary Smith, with no usage and the business rate (40 cents)
 

	    cust1.useHours(6);
	    cust2.useHours(10);
	    cust1.useHours(4);
	    cust2.useHours(20);
	    
	    cust1.display();   // should say that Harry Jones used 10 hours at 0.6 each, totalling 6
	    cust2.display();   // should say that Mary Smith used 30 hours at 0.4 each, totalling 12
	}
}