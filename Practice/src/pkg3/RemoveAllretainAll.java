package pkg3;

import java.util.ArrayList;

public class RemoveAllretainAll {
	public static void main(String[] args) {
		 ArrayList<Integer> a1 =new ArrayList<>();
		 a1.add(10);
		 a1.add(34);
		 a1.add(25);
		 a1.add(52);
		 
		 
		 ArrayList<Integer> a2 =new ArrayList<>();
		 a2.add(10);
		 a2.add(34);
		 a1.removeAll(a2);// delete 10,34
		 System.out.println(a1);
		 System.out.println(a2);
		 
		 ArrayList<Integer> a3 =new ArrayList<>();
		 a3.add(10);
		 a3.add(34);
		 a3.add(25);
		 a3.add(52);
		 
		 ArrayList<Integer> a4 =new ArrayList<>();
		 a4.add(10);
		 a4.add(34);
		 a3.retainAll(a4);// delete all except a4
		 System.out.println(a3);
		 System.out.println(a4);
		 
	}

}
