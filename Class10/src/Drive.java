
public class Drive {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		
		obj.setName("Ihsanul");
		obj.setPIN(1234);
		obj.setBalance(1000);
		obj.setACNO(201);
		
		System.out.println("Name: "+obj.getName());
		System.out.println("ACNO: "+obj.getACNO());
		System.out.println("PIN: "+obj.getPIN());
		System.out.println("Balance: "+obj.getBalance());
		
		BankAccount obj1 = new BankAccount("Ihsanul",201,1234,1000.0);
		System.out.println(obj1.getInfo());
		BankAccount obj2 = new BankAccount("Haque",202,1235);
		System.out.println(obj2.getInfo());
		

	}

}
