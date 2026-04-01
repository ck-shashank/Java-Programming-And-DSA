package pkg1;

public class Instagram {
	String un;
	String pass;
	int age;
	long mob;
	public Instagram(String un, int age, long mob) {
		
		this.un = un;
		this.age = age;
		this.mob = mob;
		pass=un+age+(mob%10000);
		System.out.println("account created");
		System.out.println("your password is "+pass);
				}
	public void login(String un,String pass) {
		if(this.un.equals(un)) {
			if(this.pass.equals(pass)) {
		
			System.out.println("Logged-in");
		}
		else {
			System.out.println("Invalid password");
		}
		}
			else {
				System.out.println("invalid username");
			}
				
	}
	
			
		public void login(double mob, String pass) {
		if(this.mob==mob && this.pass.equals(pass)) {
			System.out.println("Logged-in");
		}
		else {
			System.out.println("invalid mob number or password");
		}
		
	}

}
