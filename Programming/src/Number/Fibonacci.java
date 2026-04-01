package Number;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a range");
	int range=sc.nextInt();
	int a=0;
	int b=1;
	int sum=0;
	for(int i=1;i<=range;i++) {
		System.out.print(a+" ");
		sum=a+b;
		a=b;
		b=sum;
	}
	 
		sc.close();
	}
	
	 
	 
	}

	
