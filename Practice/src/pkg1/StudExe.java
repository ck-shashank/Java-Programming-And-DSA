package pkg1;

public class StudExe {
public static void main(String[] args) {
	Stud s1=new Stud("Chandan", 1, 98546);
	Stud s2=new Stud("Shashank", 2, 986554412L);
	ServiceStud.swapId(s1, s2);
	ServiceStud.swapDetails(s1, s2);
}
}
