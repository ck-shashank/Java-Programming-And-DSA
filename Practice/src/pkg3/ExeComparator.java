package pkg3;

import java.util.ArrayList;
import java.util.Collections;

public class ExeComparator {
public static void main(String[] args) {
	ArrayList<Emp1> a1=new ArrayList<Emp1>();
	a1.add(new Emp1("abc", 1, 10000.0));
	a1.add(new Emp1("abc", 3, 20000.0));
	a1.add(new Emp1("abc", 2, 30000.0));
	Collections.sort(a1, new CompareById());
	System.out.println(a1);
	Collections.sort(a1, new CompareBySal());
	System.out.println(a1);
	 
}
}
