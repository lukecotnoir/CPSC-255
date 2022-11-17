// class to hold info on a person on a news team, their name, their
// role, and how many years of experience they have had.


public class NewsPerson
{
   private String myname;
   private String myrole;
   private int myexperience;  // number of years
   
   // constructor
   public NewsPerson(String name, String role, int years)
   {
      myname = name;
      myrole = role;
      myexperience = years;
   }
   
   public void setMyname(String myname) {
      this.myname = myname;
   }
   public void setMyrole(String myrole) {
      this.myrole = myrole; 
   }
   public void setMyexperience(int myexperience) {
      this.myexperience = myexperience;
   }
   // getters
   public String getName()
   {  return myname;
   }
   public String getRole()
   {  return myrole;
   }
   public int getYears()
   {  return myexperience;
   }
     
   public String toString()
   {	return getName() + ","+getRole() + ","+ getYears();
   }
}
