import java.util.Scanner;

class InvalidPhoneNumber extends Exception{
	public InvalidPhoneNumber(String warning) {
		super(warning);
	}
}


public class CustomException {

	public static void checkPhoneNumber(String phone) throws InvalidPhoneNumber {
		if(phone.length()!=11) throw new InvalidPhoneNumber("Phone number must be 11 digit!");
		else System.out.println("Valid phone number.");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter phone number: ");
			String phone = input.next();
			checkPhoneNumber(phone);
		}catch(InvalidPhoneNumber ex) {
			System.out.println(ex.getMessage());
		}

	}

}
