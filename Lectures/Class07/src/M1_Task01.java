import java.util.Scanner;

public class M1_Task01 {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		for (int i = 2; i <= n; i++) {
			if(isPerfect(i)==1) //if the method return 1 that means i is perfect
				System.out.println(i+" ");
		}
		
		input.close();

	}
	
	//static to static relation 
	public static int isPerfect(int n) {
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum += i;
		}
		
		if(sum==n) //if summation of divisors are equals to the given number n then it's a perfect number
			return 1;
		else
			return 0;
	}

}
