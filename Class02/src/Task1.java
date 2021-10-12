//java.util.*;
//java.lang.*;
public class Task1 {

	public static void main(String[] args) {
		//Area and perimeter of a circle 
		double r = 5.5;
		double perimeter = 2.0*Math.PI*r;
		//double area = Math.PI*r*r;
		double area = Math.PI*Math.pow(r, 2);
		
		//output
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);

	}

}
