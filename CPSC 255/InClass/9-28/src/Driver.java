// a stupid demo program for inheritance and bank accounts
// written by Scott McElfresh


public class Driver 
{     
	public static void main(String[] args) 
    {
		
		Account mine = new Account("Scott",105,45.60);
		
		mine.display();
		mine.deposit(10);
		mine.withdraw(15);
		
		System.out.println("--------------");
		System.out.println(mine);
		System.out.println("--------------");
		mine.display();
       
       

		JointAccount mine2 = new JointAccount("Scott",106,70.30,"Sarah");
		
		mine2.display();
		mine2.deposit(10);
		mine2.withdraw(15);
		
		System.out.println("--------------");
		mine2.display();
       
    
		SavingsAccount mine3 = new SavingsAccount("Scott",107,50,2.5);
		
		mine3.display();
		mine3.deposit(10);
		mine3.withdraw(15);
		
		System.out.println("--------------");
		mine3.display();		
		
	    System.out.println("--------------");
	    mine3.addInterest();
		mine3.display();	
      
  }
}