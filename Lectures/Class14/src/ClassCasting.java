class A{
	A(){
		//super()
		System.out.println("A");
	}
	
	public void print() {
		System.out.println("Hello from class A!");
	}
	
}
class B extends A{
	B(){
		//super()
		System.out.println("B");
	}
	
	@Override
	public void print() {
		System.out.println("Hello from class B!");
	}
	
}
class C extends B{
	C(){
		//super()
		System.out.println("C");
	}
	
	
}
public class ClassCasting {

	public static void main(String[] args) {
		
		A obj = new C();
		((B)obj).print();

	}

}
