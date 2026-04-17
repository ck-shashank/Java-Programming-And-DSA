package TCS_Practice;

import java.util.Arrays;

public class SingleElement {
   public static void main(String[] args) {
	int arr[]= {4,5,3,4,3,2,2};

		Arrays.sort(arr);
		 
		int i=0;
		while(i+1<arr.length) {
			if(arr[i]!=arr[i+1]) {
				 System.out.println(arr[i]);
				return;
			}
			i=i+2;
			}
		System.out.println(arr[arr.length-1]);
	
	// 2nd method without sorting 
	int result=0;
	for(int num: arr) {
		result ^=num;
	}
	System.out.println(result);
	
		}
   
			
			}

