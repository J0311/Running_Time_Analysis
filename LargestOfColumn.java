import java.util.Scanner;
import java.util.Random;

public class LargestOfColumn {
	public static void main(String[] args) {
		
		int[][] numbers;
		Scanner scan = new Scanner(System.in);

// Get two positive numbers from user
		
		int rows, columns;
		do {
			
			System.out.print("Enter a number of rows for the array > ");
			rows = scan.nextInt();
			System.out.print("Enter a number of columns for the array > ");
			columns = scan.nextInt();
			
		} while (rows < 1 || columns < 1);

// instantiate and generate array numbers
		
		numbers = new int[rows][columns];
		generateArray(numbers);
		
		System.out.println("The resulting array is:\n" + toString(numbers));

// Get column index from user
		
		int column;
		
		do {
			System.out.print("Enter a valid column index for the array > ");
			column = scan.nextInt();
			
		} while (column < 0 || column >= columns);

		System.out.println("The largest element in column " + column + " is " + largest(numbers, column));

	}

// This method runs in O( p * q ) where p = number of rows in arr q = number 
// of columns in arr
	 
	public static int largest(int[][] arr, int colIndex) {
		
		int maximum = 0;
		boolean firstValidRow = false;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (!firstValidRow && colIndex < arr[i].length) {
				maximum = arr[i][colIndex];
				firstValidRow = true;
			}
			
			if (colIndex < arr[i].length) {
				if (maximum < arr[i][colIndex])
					maximum = arr[i][colIndex];
			}
			
			count++;
		}

		System.out.println("Number of statements executed inside innermost loop: " + count);
		return maximum;
	}

	public static String toString(int[][] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				result += arr[i][j] + " ";
			result += "\n";
		}
	
		return result;
	}

	public static void generateArray(int[][] arr) {
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = rand.nextInt(1000);
		}
	}
}
