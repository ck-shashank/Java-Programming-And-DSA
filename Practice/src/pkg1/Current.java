package pkg1;

public class Current extends Bank{
	long mob;
	public Current(String un,long accNo,double bal,long mob) {
		super(un,accNo,bal);
		this.mob=mob;
	}
	@Override
	public void withdraw(double amt) {
		// minimum balance is 500
		if(bal-amt>=500) {
			bal=bal-amt;
			System.out.println("new balance is "+bal);}
			else
			{
			System.out.println("Invalid balance");	
			}
			
		}
	@Override
	public void details() {
		super.details();
		System.out.println(mob);
	}
	}
	 
	


