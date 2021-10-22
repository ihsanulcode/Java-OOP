
public class LoopContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			if(i==3) continue;
			sum += i;
		}
		System.out.println("Sum: "+sum);

	}

}
