package pkg1;


public class GoogleForm {
String fname;
String mname;
String lname;
long mob;
long alt_mob;

String email;
long aadharNo;
public GoogleForm(String fname, String mname, String lname, long mob, long alt_mob, String email, long aadharNo) {
	this.fname = fname;
	this.mname = mname;
	this.lname = lname;
	this.mob = mob;
	this.alt_mob = alt_mob;
	this.email = email;
	this.aadharNo = aadharNo;
}
public GoogleForm(String fname, String lname, long mob, String email, long aadharNo) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.mob = mob;
	this.email = email;
	this.aadharNo = aadharNo;
}
public GoogleForm(String fname, String mname, String lname, long mob, String email, long aadharNo) {
	super();
	this.fname = fname;
	this.mname = mname;
	this.lname = lname;
	this.mob = mob;
	this.email = email;
	this.aadharNo = aadharNo;
}
public GoogleForm(String fname, String lname, long mob, long alt_mob, String email, long aadharNo) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.mob = mob;
	this.alt_mob = alt_mob;
	this.email = email;
	this.aadharNo = aadharNo;
}
public void details() {
	System.out.println("First Name: "+fname);
	if(mname!=null) {
		System.out.println("Middle Name:"+mname);
	}
	System.out.println("last Name: "+lname);
	System.out.println("Mob No: "+mob);
	if(alt_mob>0) {
		System.out.println("Alternate Mob: "+alt_mob);
		
	}
	System.out.println("EmailId: "+email);
	System.out.println("AAdhar No: "+aadharNo);
	}
public static void main(String[] args) {
	GoogleForm g1=new GoogleForm("Chandan","Kumar","Shashank",9876543210l,8976543210l,"ck@gmail.com",714877149630l);
	g1.details();
	GoogleForm g2=new GoogleForm("Chandan","Shashank",9876543210l,"ck@gmail.com",714877149630l);
	g2.details();
	GoogleForm g3=new GoogleForm("Chandan","Shashank",9876543210l,8976543210l,"ck@gmail.com",714877149630l);
	g3.details();
	GoogleForm g4=new GoogleForm("Chandan","Kumar","Shashank",9876543210l,"ck@gmail.com",714877149630l);
	g4.details();
    
}
}
