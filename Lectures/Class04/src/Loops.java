
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//There are three basic types of loop
		//1. For loop
		//2. While loop
		//3. Do-while loop
		
		
		//For loop
		for(int i=1;i<=10;i++) {
			System.out.println("I'm in step "+i);
		}
		
		//while loop
		int j = 1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		//Do-while loop
		int k = 1;
		do {
			System.out.println("Step "+k);
			k++;
		}while(k<=10);

	}

}
