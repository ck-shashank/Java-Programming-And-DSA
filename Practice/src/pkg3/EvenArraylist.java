package pkg3;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenArraylist {
  public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(20);
	a1.add(25);
	a1.add(32);
	a1.add(55);
	for(Integer n: a1) {
		if(n%2==0) {
			System.out.println(n);
		}
	}
	System.out.println("----------------------------------");
	// Print even number using Iterator
	 Iterator<Integer> i1= a1.iterator(); // converting ArrayList(collection) into Iterator type using iterator().
	 //has()->use to return next element
	 //hasNext()->check next element present or not 
//	 while(i1.hasNext()) {
//		 System.out.println(i1.next());
//	 }
	 System.out.println("------------------------------------");
	 while(i1.hasNext()) {
	  int num=i1.next();
	  if(num%2==0) {
		  System.out.println(num);
	  }
	 }
	 }
}
