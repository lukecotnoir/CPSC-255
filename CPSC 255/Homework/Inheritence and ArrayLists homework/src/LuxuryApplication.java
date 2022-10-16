import java.util.ArrayList;

public class LuxuryApplication {

	public static void main(String[] args) {
		Lodging place1 = new Lodging("Holiday Inn", 123);
		Lodging place2 = new Lodging("Hilton", 212);
		System.out.println(place1);
		System.out.println(place2);
		LuxuryLodging resort1 = new LuxuryLodging("PamperMe", 50, 3);
		System.out.println(resort1);
		
		// LuxuryLodging assumes only 1 spa, unless told otherwise
		LuxuryLodging resort2 = new LuxuryLodging("RelaxHere", 25);
		System.out.println(resort2);
		System.out.println("--------------------");
		
		resort1.addSpa();
		resort1.addSpa();  
		System.out.println(resort1);
		System.out.println(resort2);
		System.out.println("--------------------");
		resort2.addSpa();
		System.out.println(resort1);
		System.out.println(resort2);
		System.out.println("--------------------");
		LuxuryLodging resort3 = new LuxuryLodging("StayAWhile",100, 16);
		System.out.println(resort1);
		System.out.println(resort2);
		System.out.println(resort3);
		int totalSpas = resort1.getNumberOfSpas() + resort2.getNumberOfSpas() + resort3.getNumberOfSpas();
		System.out.println("Total number of spas: " + totalSpas);
		
		System.out.println("--------------------");
		ArrayList<Lodging> hotelList1 = new ArrayList<Lodging>();
		hotelList1.add(place1);
		hotelList1.add(resort1);
		hotelList1.add(place2);
		hotelList1.add(resort2);
		hotelList1.add(resort3);
		
		ArrayList<Lodging> hotelList2 = new ArrayList<Lodging>();
		hotelList2.add(new Lodging("Super8",45));
		hotelList2.add(new Lodging("Days Inn",62));
		hotelList2.add(resort2);
		hotelList2.add(new Lodging("Hampton",100));
		hotelList2.add(new Lodging("Holiday Inn",124));
		hotelList2.add(resort1);
		hotelList2.add(new Lodging("Jasper Center",306));
		hotelList2.add(new Lodging("Main St Motel",15));
		hotelList2.add(new Lodging("Hilton",212));
		hotelList2.add(resort3);
		hotelList2.add(new LuxuryLodging("The Hills",98, 6));
	
		System.out.println("****Output below here is not correct.  You should be able to determine the expectation yourself.***");
		
		int totalRooms ;
		totalRooms = getTotalRooms(hotelList1);
		System.out.println("Total rooms in hotelList1:" + totalRooms);
		
		totalRooms = getTotalRooms(hotelList2);
		System.out.println("Total rooms in hotelList2:" + totalRooms);

	
		totalSpas = getTotalSpas(hotelList1);
		System.out.println("Total spas in hotelList1:" + totalSpas);
		
		totalSpas = getTotalSpas(hotelList2);
		System.out.println("Total spas in hotelList2:" + totalSpas);
		
		String biggest ;
		biggest = getNameOfHotelWithMostRooms(hotelList1);
		System.out.println("The hotel in hotelList1 with the most rooms:" + biggest); //hilton
		biggest = getNameOfHotelWithMostRooms(hotelList2);
		System.out.println("The hotel in hotelList2 with the most rooms:" + biggest); //Jasper Center
		
		biggest = getNameOfLuxuryHotelWithMostRooms(hotelList1);
		System.out.println("The LUxury Hotel in hotelList1 with the most rooms:" + biggest);
		
		biggest = getNameOfLuxuryHotelWithMostRooms(hotelList2);
		System.out.println("The LUxury Hotel in hotelList2 with the most rooms:" + biggest);
		
		
	}
	/*
	 * returns the name of the hotel that has the most rooms.   If there is a tie,
	 * any of them can be returned.  
	 */
	private static String getNameOfHotelWithMostRooms(ArrayList<Lodging> hotelList) {
		int maxIdx = 0;
		for (int i = 0; i<hotelList.size(); i++) {
			if (hotelList.get(i).getNumberOfRooms() > hotelList.get(maxIdx).getNumberOfRooms()) maxIdx = i;
		}
		return hotelList.get(maxIdx).getBrand();
	}
	
	/*
	 * returns the name of the luxury lodging hotel that has the most rooms.   If there is a tie,
	 * any of them can be returned.  
	 */
	private static String getNameOfLuxuryHotelWithMostRooms(ArrayList<Lodging> hotelList) {
		int maxIdx = 0;
		ArrayList<Lodging> onlyLuxury = new ArrayList<Lodging>();
		for (int i = 0; i<hotelList.size(); i++) {
			if (hotelList.get(i) instanceof LuxuryLodging) onlyLuxury.add(hotelList.get(i));
		}
		for (int i = 0; i<onlyLuxury.size(); i++) {
			if (onlyLuxury.get(i).getNumberOfRooms() > onlyLuxury.get(maxIdx).getNumberOfRooms()) maxIdx = i;
			
		}
		return onlyLuxury.get(maxIdx).getBrand();
	}

	/*
	 * Return the total number of rooms at all of the hotels in the list.
	 */
	private static int getTotalRooms(ArrayList<Lodging> hotelList) {
		int total = 0;
		for (Lodging i : hotelList) {
			total += i.getNumberOfRooms();
		}
		return total;
	}
		
	/*
	 * Return the total number of spas at all of the hotels in the list.
	 */
	private static int getTotalSpas(ArrayList<Lodging> hotelList) {
		int total = 0;
		ArrayList<LuxuryLodging> onlyLuxury = new ArrayList<LuxuryLodging>();
		for (int i = 0; i<hotelList.size(); i++) {
			if (hotelList.get(i) instanceof LuxuryLodging) onlyLuxury.add((LuxuryLodging) hotelList.get(i));
		}
		for (LuxuryLodging i : onlyLuxury) {
			if (i instanceof LuxuryLodging) total += i.getNumberOfSpas();
		}
		return total;
	}

}
