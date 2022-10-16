
public class ArraysDemo {

	public static void main(String[] args) {
		int[] data = {7,19,6,2};
		System.out.println(data[1]);
		System.out.println(data[3]);
		System.out.println(data[0]);
		
		for (int pos=0; pos < data.length; ++pos)
			System.out.println(data[pos]);
		
		String [] info = {"Monday", "Tuesday", "Wednesday"};
		for (int pos = 0; pos < info.length; ++pos);
			
		for (String one: info)
			System.out.println(one);
	}

}
