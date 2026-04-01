package pkg3;

import java.util.Comparator;

public class CompareBySal implements Comparator<Emp1>{
	@Override
	public int compare(Emp1 e1,Emp1 e2) {
		return (int)(e2.sal-e1.sal);
	}

}
