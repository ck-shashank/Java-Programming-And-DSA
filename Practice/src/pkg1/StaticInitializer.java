package pkg1;

public class StaticInitializer {
	static int x=10;
	static
	{
		System.out.println("static block-1");
	}
	public static void main(String[] args) {
		System.out.println(x);
		System.out.println("main block");
	}
	static {
		System.out.println("static block-2");
	}

}
