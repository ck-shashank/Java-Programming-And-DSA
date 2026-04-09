package Sorting;
//Given a non-negative integer x, 
//return the square root of x rounded down to the nearest integer. 
//The returned integer should be non-negative as well.

// Note-You must not use any built-in exponent function or operator.

import java.util.Scanner;

public class SqrtX {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int x=sc.nextInt();
	if(x==0) System.out.println(0);
	int low=1;int high=x;
	while(low<=high) {
		int mid=low +(high-low)/2;
		if(mid==x/mid) {
			System.out.println(mid);
			break;
		}
		else if(mid>x/mid) high=mid-1;
		else low=mid+1;
	}
	 
	sc.close();
	
}
}
