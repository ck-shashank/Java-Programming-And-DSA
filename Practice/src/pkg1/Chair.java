package pkg1;

public class Chair {
     String color;
     String brand;
	 public Chair(String color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	 }
	 @Override
	 public String toString() {
		return "Chair [color=" + color + ", brand=" + brand + "]";
	 }
     
     
}
