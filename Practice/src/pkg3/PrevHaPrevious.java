package pkg3;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrevHaPrevious {
public static void main(String[] args) {
	 ArrayList<Integer> a1 =new ArrayList<>();{
		 a1.add(10);
		 a1.add(34);
		 a1.add(25);
		 a1.add(52);
		 ListIterator<Integer> l1= a1.listIterator(a1.size());
		 while(l1.hasPrevious()) {
			 System.out.println(l1.previous());
		 }
		 
	 }
}
}
