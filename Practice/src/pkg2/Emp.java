package pkg2;

public class Emp {
      private String un;
      private String email;
      private long mob;
      private String pass;
	  public Emp(String un, String email, long mob, String pass) {
		super();
		this.un = un;
		this.email = email;
		this.mob = mob;
		this.pass = pass;
	  }
	  public String getUn() {
		  return un;
	  }
	  public void setUn(String un) {
		  this.un = un;
	  }
	  public String getEmail() {
		  return email;
	  }
	  public void setEmail(String email) {
		  this.email = email;
	  }
	  public long getMob() {
		  return mob;
	  }
	  public void setMob(long mob) {
		  this.mob = mob;
	  }
	  public String getPass() {
		  return pass;
	  }
	  public void setPass(String pass) {
		  this.pass = pass;
	  }
	  @Override
	  public String toString() {
		return "Emp [un=" + un + ", email=" + email + ", mob=" + mob + ", pass=" + pass + "]";
	  }
	  
}
