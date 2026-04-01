package pkg1;

public class ExeBank {
	public static void main(String[] args) {
		Saving s1=new Saving("Chandan", 123456789L, 1200, "abc@gmail.com");
		s1.deposit(120);
		s1.withdraw(1200);
		s1.checkBal();
		s1.details();
		Current c2=new Current("Abac", 123456L, 500,45564116L);
		c2.withdraw(200);
		c2.deposit(540);
		c2.checkBal();
		c2.details();
	}

}
