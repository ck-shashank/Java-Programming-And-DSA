package pkg1;

public class B {
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(A.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
	//	System.out.println(d);// error private
		A.m1();
		A.m2();
		a1.m3();
	//	a1.m4(); private
	}

}
