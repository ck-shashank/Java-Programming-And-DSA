package Sorting;

import java.util.Scanner;

//Given an array arr of positive integers sorted in a strictly increasing order, 
//and an integer k.

//Return the kth positive integer that is missing from this array.
public class KthMissingElementInPositiveSortedArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	int k=sc.nextInt();
	
	int low=0;
	int high=n-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		int missing=arr[mid]-(mid+1);
		if(missing<k)low=mid+1;
		else high=mid-1;
		}
		System.out.println(low+k);		
	}
}

