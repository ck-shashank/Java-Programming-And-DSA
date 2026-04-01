package pkg1;

public class Saving extends Bank {
	String mail;

	public Saving(String un, long accNo, double bal, String mail) {
		super(un, accNo, bal);
		this.mail = mail;
	}
	@Override
	public void withdraw(double amt) {
		if(bal-amt>=0)
		{
			bal=bal-amt;
			System.out.println("New balanve is "+bal);
		}
		
	}
	@Override
	public void details() {
		super.details();
		System.out.println(mail);
	}
	
	
	}
