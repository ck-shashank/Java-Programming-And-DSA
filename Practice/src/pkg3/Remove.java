package pkg3;

import java.util.ArrayList;

public class Remove {
	 public static void main(String[] args) {
		 ArrayList<Integer> a1 =new ArrayList<>();
		 a1.add(10);
		 a1.add(34);
		 a1.add(25);
		 a1.add(52);
		 // remove(Object o)  remove(int index)
		 a1.remove(1);
		 a1.remove(Integer.valueOf(52));
		 System.out.println(a1);
	}

}
