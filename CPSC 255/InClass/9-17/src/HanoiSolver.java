// This program helps the user to solve the Towers of Hanoi problem.
// - The program assumes that the pegs are labeled A, B, and C, and that peg A
//   is where the disks start, and peg C is where they should end up.
// - The number of disks is information that the user needs to enter when asked.
// - The disks are assumed to be labeled, 1,2,3, etc.  from smallest
//   to largest.

// written by Scott McElfresh


import javax.swing.JOptionPane;

public class HanoiSolver 
{   // program starting point.
	public static void main(String [] args)
    {
      
       int numdisks = Integer.parseInt(JOptionPane.showInputDialog("How many disks?"));

       System.out.println("\nThe following moves will move " + numdisks
              + " disks from peg A to peg C.\n\n" );


        TowerOfHanoi(numdisks,'A','C');

    }
    //*****************************
// This function displays the moves required to move n disks from
// the startpeg to the targetpeg (assumed to be A, B, or C).
// The moves are displayed in a textual form.
//
public static void TowerOfHanoi(int n, char startpeg, char targetpeg)
{
    if (n == 1 )
       System.out.println( "- Move disk number 1 from peg " + startpeg
            + " to peg " + targetpeg + ".");
    else
    {
       char otherpeg = other(startpeg,targetpeg);

       // move smaller disks out of the way.
       TowerOfHanoi( n-1, startpeg, otherpeg);

       // move the bottom disk
       System.out.println( "- Move disk number " + n + " from peg " + startpeg
            + " to peg " + targetpeg + ".");

       // move smaller disks to right spot
       TowerOfHanoi( n-1, otherpeg, targetpeg);
    }
}


//****************
// This function determines which peg is not represented by one of the
// parameters.   Assumes the choices are A, B, and C.
//
public static char other(char peg1, char peg2)
{
   if ((peg1 == 'A') && (peg2 == 'B'))
   	return ('C');
   if ((peg1 == 'A') && (peg2 == 'C'))
   	return ('B');
   if ((peg1 == 'B') && (peg2 == 'A'))
   	return ('C');
   if ((peg1 == 'B') && (peg2 == 'C'))
   	return ('A');
   if ((peg1 == 'C') && (peg2 == 'A'))
   	return ('B');
   if ((peg1 == 'C') && (peg2 == 'B'))
   	return ('A');
   	
   	
   	// java requires a return of something
   	return ('D');// doesn't matter what we return because we shouldn't get here
}

}
