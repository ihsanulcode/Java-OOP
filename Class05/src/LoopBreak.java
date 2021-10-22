
public class LoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		for(int i=1;i<=5;i++) {
			if(i==3)
				break;
			System.out.println(i);
		}
		
		System.out.println("Rest of the code...");
		*/
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i==5) break;
			sum += i; //sum = sum+i;
		}
		
		System.out.println("Sum: "+sum);

	}

}
