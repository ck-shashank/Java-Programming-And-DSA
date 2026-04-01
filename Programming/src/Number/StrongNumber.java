 package Number;
import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		int fact=1;
		for(int i=1; i<=rem;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println(temp+" is a strong number");
	}
	else {
		System.out.println(temp+" is not a strong number");
	}
		sc.close();
	}
	
	 
	 
	}

	
