import java.util.Scanner;

public class Driver{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		
		Circle c1 = new Circle(r);
		System.out.println(c1.getArea());

		//Calling static method
		//Circle.info();
	}
}