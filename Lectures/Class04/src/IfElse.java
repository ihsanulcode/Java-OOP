import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		if(n>0) {
			System.out.println("Positive number.");
		}else if(n<0) {
			System.out.println("Negative number.");
		}else if(n==100) {
			System.out.println("It's 100");
		}else if(n==1000) {
			System.out.println("It's 1K");
		}else {
			System.out.println("Zero");
		}

	}

}
