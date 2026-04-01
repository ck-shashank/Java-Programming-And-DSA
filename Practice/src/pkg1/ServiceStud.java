package pkg1;

public class ServiceStud {
	public static void swapId(Stud a, Stud b) {
		System.out.println("Id of student s1 is = "+b.id);
		System.out.println("Id of student s2 is = "+a.id);
		
	}
	public static void swapDetails(Stud a, Stud b) {
		System.out.println("Swapped details od Student s1----------");
		System.out.println(b.name);
		System.out.println(b.id);
		System.out.println(b.mob);
		System.out.println(Stud.schoolName);
		System.out.println("Swapped details od Student s2----------");
		System.out.println(a.name);
		System.out.println(a.id);
		System.out.println(a.mob);
		System.out.println(Stud.schoolName);
		
	}

}
