package pkg1;

public class Bank {
	String un;
	long accNo;
	double bal;
	static String bankName="SBI";
	public Bank(String un, long accNo, double bal) {
		super();
		this.un = un;
		this.accNo = accNo;
		this.bal = bal;
	}
	public void deposit(double amt) {
		if(amt>0) {
		bal=bal+amt;
		System.out.println("New balance is "+bal);
		}
		else 
			System.out.println("invalid amount");
	}
	public void withdraw(double amt) {
		System.out.println("Method yet to be overrided");
		
	}
	public void checkBal() {
		System.out.println("Balance is "+bal);
	}
	public void details() {
		System.out.println(un);
		System.out.println(accNo);
		System.out.println(bal);
		System.out.println(bankName);
	}
	

}
