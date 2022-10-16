
public class Demo2D {

	public static void display2DarrayOfInts(int [][] table) {
		for (int rowIndex = 0; rowIndex < table.length;++rowIndex) {
			for (int columnIndex = 0; columnIndex < table[rowIndex].length; ++ columnIndex)
				System.out.print(table[rowIndex][columnIndex]);
		}
	}
	public static void main(String[] args) {

		int [][] info = {{6, 7, 8},
				         {15, 9, 10},
				         {12,18,7, 6},
				         {9, 25,6}
		};
		
		for (int[] row : info) {
			for (int item :row){
				System.out.print(item + " ");
			}
			System.out.println();
		}

	}

}