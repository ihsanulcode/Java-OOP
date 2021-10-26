import java.util.Scanner;

//Take all of the quiz marks of your section. And then find the sum and average mark.
public class Sum {

	public static void main(String[] args) {
		// SCanner class
		Scanner input = new Scanner(System.in);

		// getting row, col size from user
		System.out.print("Enter row: "); //3 
		int row = input.nextInt();
		System.out.print("Enter col: "); //3
		int col = input.nextInt();

		// declaring 2D Array
		double[][] arr = new double[row][col];

		// getting array elements from user
		System.out.println("\nEnter marks: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("[" + i + "][" + j + "]: ");
				arr[i][j] = input.nextDouble();
			}
		}
		
		//summing
		double sum = 0.0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];
			}
		}
		
		//average 
		double size = arr.length*arr[0].length;
		double average = sum/size;
		
		//output
		System.out.println("\n\nSum: "+sum);
		System.out.println("Average: "+average);

	}

}
