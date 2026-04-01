package Number;
import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int dec=sc.nextInt();
	int bin=0;
	int i=1;
	while(dec!=0) {
		int rem=dec%2;
		bin=bin+rem*i;
		i=i*10;
		
	
		dec=dec/2;
		sc.close();
	}
	
	System.out.println("decimal "+bin);
	 
	}
}
	
