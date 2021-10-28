import java.util.Scanner;

public class M1_Task02 {

	public static void main(String[] args) {
		//Scanner class
		Scanner in = new Scanner(System.in);
		
		//getting a 5 digit positive integer number from user
		System.out.print("Enter n: ");
		int n = in.nextInt();
		
		//invoking the method and getting the sum of digits
		int ans  = sumOfDigits(n);
		
		//output
		System.out.println("Sum of digits: "+ans);
		in.close();
	}
	
	public static int sumOfDigits(int n) {
		//temporary sum variable 
		int sum = 0;
		while(n!=0) {
			int lastDigit = n%10;
			sum += lastDigit;
			n = n/10;
		} 
		//end of the loop
		
		return sum;
		
	}

}
