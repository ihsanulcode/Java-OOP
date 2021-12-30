import java.util.Scanner;

//Scissor - Rock - Paper GAME
public class GAME101 {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		int play;
		
		do {
			System.out.println();
			System.out.print("\t\tScissor (0), rock (1), paper (2): ");
			//User will enter 
			play = input.nextInt();
			//computer will choose 
			int computer = (int) (Math.random()*(2-0+1)+0);
			
			if(computer==0) {
				switch(play) {
					case 0:
						System.out.println("\t\t~~ The Computer is Scissor. You are Scissor too. It is a draw!");
						break;
					case 1:
						System.out.println("\t\t~~ The Computer is Scissor. You are rock. You won!");
						break;
					case 2:
						System.out.println("\t\t~~ The Computer is Scissor. You are paper too. You lose!");
						break;
					default:
						System.out.println("\t\t~~ Wrong play!");
				}
			}else if(computer==1) {
				switch(play) {
					case 0:
						System.out.println("\t\t~~ The Computer is rock. You are Scissor. Your lose!");
						break;
					case 1:
						System.out.println("\t\t~~ The Computer is rock. You are rock too. It is a draw!");
						break;
					case 2:
						System.out.println("\t\t~~ The Computer is rock. You are paper. You win!");
						break;
					default:
						System.out.println("\t\t~~ Wrong play!");
				}
			}else if(computer==2) {
				switch(play) {
				case 0:
					System.out.println("\t\t~~ The Computer is paper. You are Scissor. Your win!");
					break;
				case 1:
					System.out.println("\t\t~~ The Computer is paper. You are rock. You lose!");
					break;
				case 2:
					System.out.println("\t\t~~ The Computer is paper. You are paper too. It is a draw!");
					break;
				default:
					System.out.println("\t\t~~ Wrong play!");
			}
		}
		}while(play==0||play==1||play==2);
		
		input.close();
	}

}
