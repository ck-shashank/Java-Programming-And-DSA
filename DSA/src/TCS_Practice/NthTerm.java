package TCS_Practice;

import java.util.Scanner;

//Consider the following series: 1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187....
//This series is a mixture of 2 series all the odd terms in this series form a 
//geometric series and all the even terms form yet another geometric series. 
//Write a program to find the Nth ferm in the series.
public class NthTerm {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the term");
	int n=sc.nextInt();
	
	//first check whether the n is even or odd , for even it is in gp with r=3, for odd it is in gp with r=2
	if(n%2==0) {
		int nth= (int) Math.pow(3, n/2 -1); //gp series nth term formula a.r^(n-1)
		System.out.println(nth);
	}
	else {
		int nth= (int) Math.pow(2, n/2);
		System.out.println(nth);
	}
}
}
