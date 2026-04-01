package pkg1;

public class Fruits {
    String name;
    double price;
    String clr;
	public Fruits(String name, double price, String clr) {
		super();
		this.name = name;
		this.price = price;
		this.clr = clr;
	}
	public void fruitDetails() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(clr);
	}
	
    
}
