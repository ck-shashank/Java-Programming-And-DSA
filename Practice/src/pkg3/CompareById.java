package pkg3;
import java.util.Comparator;

public class CompareById implements Comparator<Emp1>{
	@Override
	public int compare(Emp1 e1,Emp1 e2) {
		return e1.id-e2.id;
	}
}