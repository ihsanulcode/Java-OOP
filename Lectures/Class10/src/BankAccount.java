
public class BankAccount {
	// Data fields
	private String name;
	private int ACNO;
	private int PIN;
	private double balance;

	BankAccount() {

	}

	BankAccount(String name,int ACNO,int PIN,double balance) {
		this.name = name;
		this.ACNO = ACNO;
		this.PIN = PIN;
		this.balance = balance;
	}
	
	BankAccount(String name,int ACNO,int PIN) { //This is a overloaded constructor
		this.name = name;
		this.ACNO = ACNO;
		this.PIN = PIN;
	}

	
	public String getInfo() {
		return "Name: " + name + "; AC No: " + ACNO + "; PIN: " + PIN + "; Balance: " + balance + "\n";
	}

	
	//accessor and mutator
	//getter and setter
	//Press alt+shift+s, r
	
	public String getName() {
		return name;
	}

	public int getACNO() {
		return ACNO;
	}

	public int getPIN() {
		return PIN;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setACNO(int aCNO) {
		ACNO = aCNO;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
