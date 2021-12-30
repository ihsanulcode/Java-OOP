
public class Circle {
	//Data fields
	double radius;
	static int numberOfObject;
	
	//Constructors
	Circle(){
		numberOfObject++;
	}
	
	Circle(double newRadius){
		radius = newRadius;
		numberOfObject++;
	}
	
	//Methods
	double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static void info() {
		System.out.println("numberOfObject: "+numberOfObject);
	}
}

