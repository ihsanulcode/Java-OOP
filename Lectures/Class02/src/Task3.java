import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.println("Enter v and a: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		//calculation
		double len = (v*v)/(2.0*a);
		//output
		System.out.println("ANS: "+len);
		
		input.close();
	}

}
