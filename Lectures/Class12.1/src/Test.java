class p{
	p(){
		System.out.println("p"); //print 1
	}
}

class q extends p{
	q(){
		//super();
		System.out.println("q"); //print 2
	}
}

class r extends q{
	r(){
		//super();
		System.out.println("r"); //print 3
	}
}

public class Test {

	public static void main(String[] args) {
		r obj = new r(); //Constractor chaining

	}

}
