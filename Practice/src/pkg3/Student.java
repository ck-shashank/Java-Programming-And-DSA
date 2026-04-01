package pkg3;

public class Student {
	String un;
	int id;
	double fees;
	 Address address;
	public Student(String un, int id, double fees, Address address) {
		super();
		this.un = un;
		this.id = id;
		this.fees = fees;
		this.address=address;
	}
	 

	@Override
	public String toString() {
		return "Student [un=" + un + ", id=" + id + ", fees=" + fees + ", address=" + address + "]";
	}
	}
