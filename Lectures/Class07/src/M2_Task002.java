import java.util.Scanner;

public class M2_Task002 {

	public static void main(String[] args) {
		// SCanner class
		Scanner input = new Scanner(System.in);
		
		// declaring 3*3 matrix
		int[][] arr = new int[3][3]; // because 3*3 2D array

		// getting array elements from user
		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
		//printing array in 2D
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//sum of it's main diagonal elements
		//where row == col
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(row == col)
					sum += arr[row][col];
			}
		}
		
		//output
		System.out.println("\nSum of main diagonal: "+sum);
		
		input.close();

	}

}
