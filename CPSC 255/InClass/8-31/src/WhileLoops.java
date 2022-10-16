import java.util.Scanner;

public class WhileLoops {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		int num = 0;
		
		while (count < 5) {
			num = kbd.nextInt();
			count ++;
			sum = sum + num;
		}
		System.out.println("The last number: " + num);
		System.out.println("Total: " + sum);
		
		}

}
