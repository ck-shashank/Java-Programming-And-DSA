package pkg1;

public class Factory {
    public static Chair createObj(String color,String brand) {
    	return new Chair(color,brand);
    }
    public static void main(String[] args) {
		Chair c1=createObj("red","xyz");
		System.out.println(c1);
	}
}
