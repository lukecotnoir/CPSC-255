import java.util.Scanner;

public class VolumeFn {

	public static void main(String[] args) {
		Scanner kbd;
		kbd = new Scanner(System.in);
		
		System.out.println("Enter length, width, height:");
		int length = kbd.nextInt();
		int width = kbd.nextInt();
		int height = kbd.nextInt();
		
		int volume = calculateVolume (width, length, height);
		
		
		
		
		System.out.println("Volume = " + volume);

	}

	private static int calculateVolume(int width, int length, int height) {return length * width * height;}

}
