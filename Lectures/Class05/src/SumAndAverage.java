import java.util.Scanner;
//Task: Get 5 students numbers from user and print their sum and average
public class SumAndAverage {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		// getting array size from user
		System.out.print("Enter array size: ");
		int size = input.nextInt();

		// Array declaration
		double arr[] = new double[size];

		// getting elements from user index by index
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Student "+(i+1)+": ");
			arr[i] = input.nextDouble();
		}

		//Sum
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		double average = sum/(double)arr.length;
		
		//output
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average+" Marks");
		input.close();

	}

}
