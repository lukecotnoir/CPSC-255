
public class MoreArrays {
	
	public static void makeAChange(int[]list) {
		list = new int[5];
	}
	
	public static void change(int n) {
		n = 10;
	}
	
	public static void printOut(int [] list) {
		for (int pos=0; pos < list.length; ++pos)
			System.out.print(list[pos] + " ");
		
		/*for (int one : list)
			System.out.print(one + " ");
			*/
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int x = 5;
		change(x);
		System.out.println(x);
		
		int [] info = {19,87,65,10,98,12,456,82};
		int [] data = {43,90,78,104,9};
		
		makeAChange(info);
		makeAChange(data);
		
		printOut(info);
		printOut(data);

	}

}
