import java.util.Scanner;

public class M2_Task02 { //Task 01 actually

	public static void main(String[] args) {
		//SCanner class 
		Scanner input = new Scanner(System.in);
		
		//getting size from user
		System.out.print("Enter number of integers: ");
		int n = input.nextInt();
		
		//Declaring the array with size n
		int[] arr = new int[n];
		
		//getting integers from user
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		//get the key from user
		System.out.print("\nEnter the key: ");
		int key = input.nextInt();
		
		//linear search
		boolean found = false;
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				found = true;
				index = i;
				
				break;
			}
		}
		//end of the for loop
		
		if(found)
			System.out.println("\nFound! at index "+index);
		else
			System.out.println("\nNot Found!");
		
		input.close();

	}

}
