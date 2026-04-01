package Number;
import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a binary number");
	int bin=sc.nextInt();
	int dec=0;
	int i=1;
	while(bin!=0) {
		int rem=bin%10;
		dec=dec+rem*i;
		i=i*2;
		
	
		bin=bin/10;
		sc.close();
	}
	
	System.out.println("decimal "+dec);
	 
	}
}
	
