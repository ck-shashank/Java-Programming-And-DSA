package pkg3;

import java.util.ArrayList;

public class Search {
	public static void main(String[] args) {
		 ArrayList<Integer> a1 =new ArrayList<>();
			 a1.add(10);
			 a1.add(34);
			 a1.add(25);
			 a1.add(52);
			 System.out.println(a1.contains(10));
	System.out.println(a1.contains(100));
	 ArrayList<Integer> a2 =new ArrayList<>();
	 a2.add(10);
	 a2.add(34);
	 System.out.println(a1.containsAll(a2));
	 System.out.println(a2.containsAll(a1));

	}
	}
