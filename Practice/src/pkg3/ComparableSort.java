package pkg3;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSort {
     public static void main(String[] args) {
		ArrayList<Emp> a1=new ArrayList<>();
		a1.add(new Emp("abc", 1, 1000, null));
		a1.add(new Emp("abc", 1, 2000, null));
		a1.add(new Emp("abc", 1, 3000, null));
		a1.add(new Emp("abc", 1, 4000, null));
		Collections.sort(a1);
		System.out.println(a1);
	}
}
