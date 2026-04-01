package pkg1;

 

public class ExeEmployee {
	public static void main(String[] args) {
	/*	Employee e1=new Employee("Chandan",1 , 987654L, 10000.0);
		Employee e2=new Employee("abc",2 , 98765L, 30000.0);
		Employee e3=new Employee("Tejas", 3, 986554L, 25000.0);
		Service.details(e1);
		System.out.println("---------------------");
		Service.details(e2);
		System.out.println("---------------------");
		Service.details(e3);
		//Service.hike(e2, 20.0);
		System.out.println("---------------------");
		System.out.println( Service.maxSal(e1, e2, e3)); */
	/*	Fruits x=Service.getDetails("apple");
          Service.details(x);
		Fruits y=Service.getDetails("banana");
		Service.details(y);
	
		Fruits z=Service.getDetails("orange");
		Service.details(z); */
	/*	Human h1=new Human("pqr", 25);
		Emp e1=new Emp("Abc", 1, 1000.0);
		Student s1=new Student("xyz", 1000, 5000);
	    Service.details(e1);
		System.out.println("---------------");
		Service.details(s1);
		System.out.println("---------------");
		
		Service.details(h1); */
		  Object o1=Service.getDetails("apple");
		  Fruits f1=(Fruits)o1;
		  f1.fruitDetails();
		  
	 
		
		
	}

}
