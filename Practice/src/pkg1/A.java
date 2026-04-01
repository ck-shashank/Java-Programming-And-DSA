package pkg1;

public class A {
	public static int a=10;
	protected int b=20;
	          int c=30;
	private static int d=40;
	public static void m1() {
		System.out.println("100");
	}
	protected static void m2() {
		System.out.println("200");
	}
	void m3() {
		System.out.println("300");
	}
	private void m4() {
		System.out.println("400");
	}
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(d);
		m1();
		m2();
	    a1.m3();
	    a1.m4();
		
	}
	
	
	

}
