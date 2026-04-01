package Recursion;

public class Sum {
	public static void main(String[] args) {
		int num=10;
		System.out.println(sum(num));
	}
	public static int sum(int num) {
		if(num<=0) return num;
		return num +sum(num-1);
	}

}
