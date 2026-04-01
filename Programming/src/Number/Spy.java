package Number;
import java.util.Scanner;

public class Spy {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int sum=0;
	int prod=1;
	while(num!=0) {
		int rem=num%10;
		sum=sum+rem;
		prod=prod*rem;
		num=num/10;
		sc.close();
	}
	if(sum==prod) {
		System.out.println("Spy number");
	}
	else
		System.out.println("not spy number");
	}

}
