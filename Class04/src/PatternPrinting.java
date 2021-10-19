
public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star = 1;
		int plus = 1;
		
		for(int row = 1;row<=5;row++) {
			if(row%2!=0) {
				//odd row
				for(int j=1;j<=star;j++)
					System.out.print("*");
			}
			
			if(row%2==0) {
				//even row
				for(int j=1;j<=plus;j++)
					System.out.println("+");
			}
			
			System.out.println();
			
			star += 2;
			plus += 2;
		}

	}

}
