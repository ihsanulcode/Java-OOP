import java.util.Scanner;

public class Array2D_Basic {

	public static void main(String[] args) {
		//SCanner class
		Scanner input = new Scanner(System.in);
		
		//getting row, col size from user
		System.out.print("Enter row: ");
		int row = input.nextInt();
		System.out.print("Enter col: ");
		int col = input.nextInt();
		
		//declaring 2D Array
		int[][] arr = new int[row][col];
		
		//getting array elements from user
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("["+i+"]["+j+"]: ");
				arr[i][j] = input.nextInt();
			}
		}
		
		//printing array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print("["+i+"]["+j+"]: "+arr[i][j]);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
