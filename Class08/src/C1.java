//A class is a bundle of data fields, constructors & methods.
public class C1 {
	//data fields 
	int a;
	double b;
	String s;
	
	//There are two types of Constructors
	
	// No-argument constructor / default constructor
	public C1() {
		
	}
		
	//Argument constructor
	public C1(int a,double b,String s){
		this.a = a;
		this.b = b;
		this.s = s;
	}
	
	//methods
	public void print() {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("s: "+s);
	}

}
