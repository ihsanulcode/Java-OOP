import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//Scanner class
		Scanner in = new Scanner(System.in);
		
		//getting operator from user
		System.out.print("Enter operator: ");
		char ope = in.next().charAt(0);
		
		//getting two numbers from user
		System.out.print("Enter 1st number: ");
		int n1 = in.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = in.nextInt();
		
		//Calculation using switch - case
		switch(ope) {
			case '+':
				System.out.println("Result: "+(n1+n2));
				break;
			case '-':
				System.out.println("Result: "+(n1-n2));
				break;
			case '*':
				System.out.println("Result: "+(n1*n2));
				break;
			case '/':
				System.out.println("Result: "+(n1/n2));
				break;
			default:
				System.out.println("Invalid operator!");
		}
		
		in.close();

	}

}
