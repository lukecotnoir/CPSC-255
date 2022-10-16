import java.util.Scanner;

public class Today {

	public static void main(String[] args) {
		/*
		// ask the user for a temperature in F
		// report the equivalent in celsius
		
		// create an obnect to deal with input
		Scanner kbd;
		kbd = new Scanner(System.in);
		
		System.out.print("Enter temp in F: ");
		
		int f = kbd.nextInt();
		double c = 5.0/9 * (f - 32);
		
		System.out.println("Answer: " + c);
		*/
		
		//ask user for width, length, height
		//report volume of rectangular prism
		Scanner kbd;
		kbd = new Scanner(System.in);
		
		System.out.println("Enter length, width, height:");
		int length = kbd.nextInt();
		int width = kbd.nextInt();
		int height = kbd.nextInt();
		
		int volume = width * length * height;
		
		System.out.println("Volume = " + volume);
		
	}

}
