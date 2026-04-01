package pkg3;

public class Employee {
  String un;
  int id;
  double sal;
  public Employee(String un, int id, double sal) {
	super();
	this.un = un;
	this.id = id;
	this.sal = sal;
  }
  @Override
  public String toString() {
	return "Employee [un=" + un + ", id=" + id + ", sal=" + sal + "]";
  }
  
}
