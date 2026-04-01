package pkg1;

public class NonStaticInitializer {
	{
		System.out.println("non static block-1");
	}
	public NonStaticInitializer() {
		System.out.println("constructor block");
	}
	{
		System.out.println("non static block-2");
	}
	public static void main(String[] args) {
		System.out.println("main block");
		 new NonStaticInitializer();
		
	}
}
