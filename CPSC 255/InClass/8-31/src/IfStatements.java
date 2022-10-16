import java.util.Scanner;

public class IfStatements {
	
	public static String getResult(int score) {
		if (score < 0)
			return "Negative";
		else if (score > 0)
			return "Positive";
		else //if (score == 0)
			return "Zero";
		}
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner (System.in);
		
		System.out.print("What school?\n");
		String school = kbd.nextLine();
		
		if (school.toLowerCase().equals("cnu") || school.toLowerCase().equals("christopher newport university"))
			System.out.println("GREAT SCHOOL!!!");
		else
			System.out.println(school + " is a so-so school.");
		
		/*
		System.out.print("What is your score? ");
		int score = kbd.nextInt();
		
		String info = getResult(score);
		System.out.println(info);
		*/
		/*
		if (score < 0) {
			System.out.println("That is negative.");
			System.out.println("you won't be in final jeopardy.");
		}
		else if (score > 0)
			System.out.println("That is positive.");
		else if (score == 0) {
			System.out.println("Zero.");
			System.out.println("you won't be in final jeopardy.");
		} 
		*/
	}
}
