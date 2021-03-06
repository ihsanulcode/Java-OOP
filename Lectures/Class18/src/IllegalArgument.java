import java.util.Scanner;

public class IllegalArgument {
	
	public static void checkAge(int age) {
		if(age>=18) {
			System.out.println("Valid!");
		}else throw new IllegalArgumentException("Invalid age!");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter your age: ");
			int age = input.nextInt();
			checkAge(age);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
