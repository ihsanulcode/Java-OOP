
public class BankAccount {
	//data field
	String userName;
	int AccNo;
	double balance;
	
	//default constructor
	public BankAccount() {
		this.userName = "Not Updated";
		this.AccNo = -1;
		this.balance = 0;
	}
	
	//Argument constructor
	public BankAccount(String userName,int AccNo,double balance) {
		this.userName = userName;
		this.AccNo = AccNo;
		this.balance = balance;
	}
	
	//method
	public void AccountInfo(int key) {
		if(this.AccNo == key) {
			System.out.println("User Name: "+userName);
			System.out.println("AC No: "+AccNo);
			System.out.println("Balance: "+balance);
		}else {
			System.out.println("Access denied!");
		}
	}

}
