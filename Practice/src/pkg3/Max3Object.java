package pkg3;

public class Max3Object {

String un;
int id;
double sal;
private static Max3Object e1;
private static Max3Object e2;
private static Max3Object e3;

private Max3Object(String un, int id, double sal) {
	 
	this.un = un;
	this.id = id;
	this.sal = sal;
}
public static Max3Object createObject() {
	if(e1==null) {
		Max3Object e1= new Max3Object("abc", 1, 10000.0);
		return e1;
	}
	else if(e2==null) {
		Max3Object e2= new Max3Object("abcd", 2, 20000.0);
		return e2;
	}
	else if(e3==null) {
		Max3Object e3= new Max3Object("abcde", 3, 30000.0);
		return e3;
	}
	else 
		return null;
	
}
}
 


