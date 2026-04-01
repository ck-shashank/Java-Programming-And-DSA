package Recursion;

public class Fact {
	public static void main(String[] args) {
		int num=4;
		System.out.println(fact(num));
	}
	public static int fact(int num) {
		if(num==0 ||num==1) return 1;
		else return num*fact(num-1);
		
		
	}

}
