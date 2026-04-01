package pkg1;

public class Service {
	/* public static void details(Employee x) {
		System.out.println(x.name);
		System.out.println(x.id);
		System.out.println(x.mob);
		
		System.out.println(x.sal);
		System.out.println(Employee.companyName);
	}
	 public static void hike(Employee a,double per) {
		 a.sal=a.sal+(a.sal*per/100);
		 System.out.println("hiked salary ="+a.sal);
	 }
	 public static String maxSal(Employee a, Employee b,Employee c) {
		 if(a.sal>b.sal) {
			 if(a.sal>c.sal) {
				 return a.name;
			 }
			 else
				 return c.name;
		 }
		 else
		 {
			 if(b.sal>c.sal) {
				 return b.name;
			 }
			 else return c.name;
		 }
	 } */
	/* public static Fruits getDetails(String name) {
		 if(name=="apple")
		 {
			 Fruits f1=new Fruits("apple", 200.0,"red");
			 return f1;
		 }
		 else if(name=="banana") {
			 Fruits f2=new Fruits("banana", 100.0, "yellow");
			 return f2;
		 }
		 else {
			 System.out.println("Item not available");
			 return new Fruits("null",0.0,"null");
		 }
	 }
	 public static void details(Fruits a) {
		 System.out.println(a.name);
		 System.out.println(a.price);
		 System.out.println(a.clr);
	 }*/
/*	public static void details(Human h1) {
		if(h1 instanceof Emp) {
			Emp res1=(Emp)h1;
			System.out.println(res1.un);
			System.out.println(res1.id);
			System.out.println(res1.sal);
			
		}
		else if(h1 instanceof Student) {
			Student res1=(Student)h1;
			System.out.println(res1.un);
			System.out.println(res1.id);
			System.out.println(res1.fees);
		}
		else 
		{
			 System.out.println(h1.un);
			 System.out.println(h1.id);
			 
		}
	} */
	  public static Object getDetails(String s){
		    if(s=="apple") {
		    	Object f1=new Fruits("apple", 100, "red");
		    	return f1;
		    	  }
		    else if(s=="orange") {
		    	Object f2=new Fruits("orange", 150.0, "oramge");
		    	return f2;
		    }
		    else if(s=="iphone13") {
		    	Object e1=new Electronic("ipphone23", 70000.0, 1);
		    	return e1;
		    }
		    else {
		    	return null;
		    }
	  }
	  
	
		
	}


