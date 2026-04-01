package pkg3;

import java.util.ArrayList;

public class Exe1 {
 public static void main(String[] args) {
	 ArrayList<Employee> a1=new ArrayList<>();
		a1.add(new Employee("ck", 1, 1000.0));
		a1.add(new Employee("xyz", 2, 2000.0));
		a1.add(new Employee("abc", 3, 10500.0));
		a1.add(new Employee("pqr", 4, 10000.0));
		System.out.println(returnEmp(a1));
}
 public static Employee returnEmp(ArrayList<Employee> input) {
	  Double maxSal=input.get(0).sal;
	  for(Employee x: input) {
		  if(x.sal>maxSal) {
			  maxSal=x.sal;
		  }
	  }
	  for(Employee x: input) {
		  if(x.sal==maxSal) {
			  return x;
		  }
	  }
	  return null;
 }
}
