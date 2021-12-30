import java.util.Scanner;

public class M1_Task03 {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		// getting the range from user
		System.out.println("Enter range to print prime numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();

		// invoking generatePrime() method
		generatePrime(a, b);

		input.close();

	}

	public static void generatePrime(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}

	public static boolean isPrime(int n) {
		boolean prime = true;

		// base case
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		// end of the for loop
		return prime;
	}

}
