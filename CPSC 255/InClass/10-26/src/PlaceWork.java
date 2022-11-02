import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlaceWork {

	public static void main(String[] args) throws IOException{

		
		ArrayList<USLocation> list1 = getLocations("places-A.txt");
		displayListOfLocations(list1);
		
		System.out.println("\n------------------------------\n");
		ArrayList<USLocation> list2 = getLocations("places-B.txt");
		displayListOfLocations(list2);

	}

	//********************
	private static void displayListOfLocations(ArrayList<USLocation> places) {
		for (USLocation loc : places)
			System.out.println(loc);
	}
	
	//********************
	private static ArrayList<USLocation> getLocations(String filename) throws IOException{
		ArrayList<USLocation> thedata =  new ArrayList<USLocation>();
		
	    FileInputStream fileByteStream = new FileInputStream(filename);
	    Scanner placeData = new Scanner(fileByteStream); 
	    
	    while (placeData.hasNextLine())
	    {
	    	String onePlace = placeData.nextLine();
	    	String[] pieces = onePlace.split(",");
	    	USLocation thisPlace = new USLocation(pieces[0],pieces[1]);
	    	thedata.add(thisPlace);
	    }
	    placeData.close();
		return thedata;
	}



}
