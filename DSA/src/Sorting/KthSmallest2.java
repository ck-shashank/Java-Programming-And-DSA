package Sorting;
//if elements are not distinct
import java.util.Arrays;

public class KthSmallest2 {
	public static void main(String[] args) {
		int arr[]= {9,7,1,2,6,8,3,3,2};
		int k=4;
		int count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				count++;
			}
			if(count==k) {
				System.out.println(arr[i]);
				break;
			}
		}
		 
			 
		 
}
}
