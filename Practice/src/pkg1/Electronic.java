package pkg1;

public class Electronic {
   String name;
   double price;
   int id;
   public Electronic(String name, double price, int id) {
	super();
	this.name = name;
	this.price = price;
	this.id = id;
   }
   public void electronicDetails() {
	   System.out.println(name);
	   System.out.println(price);
	   System.out.println(id);
   }
}
