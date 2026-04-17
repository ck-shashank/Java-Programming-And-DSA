package TCS_Practice;

import java.util.Scanner;

// you have to reach from start to goal by flipping the bit
public class BitMAnipulation {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter start");
	int start=sc.nextInt();
	System.out.println("enter goal");
	int goal=sc.nextInt();
	
	int xor=start^goal;
	int count=0;
	while(xor!=0) {
		xor=xor & (xor-1);
		count++;
	}
	System.out.println(count);
}
}
