
public class Methods {

	public static void main(String[] args) {
		//Relation ----> static + static 
		//Relation ----> non-static + non-static
		
		int a = 5;
		int b = 3;
		int ans = sum(a,b);
		System.out.println("Sum is: "+ans);
		System.out.println("Sub is: "+sub(a,b));
		print();

	}
	
	public static int sum(int a,int b) {
		//int n = a+b;
		//return n;
		return a+b;
	}
	
	public static int sub(int a,int b) {
		//int n = a-b;
		//return n;
		return a-b;
	}
	
	public static void print() {
		System.out.println("Hello!");
	}

}
