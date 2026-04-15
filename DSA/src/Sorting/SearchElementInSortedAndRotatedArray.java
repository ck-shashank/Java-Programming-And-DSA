package Sorting;

public class SearchElementInSortedAndRotatedArray {
public static void main(String[] args) {
	int arr[]= {5,6,7,8,9,10,1,2,3};
	int k=10;
	int low=0;
	int high=arr.length-1;
	int index=-1;
	while(low<=high) {
		int mid=low+(high- low)/2;
		if(arr[mid]==k) {
			index=mid;
			break;
		}
		else if(arr[low]<=arr[mid]) {
			if(arr[low]<=k && k<arr[mid])  high=mid-1;
			else low=mid+1;
		}
		else {
			if(k>arr[mid] && k<=arr[high])  low=mid+1;
			else high=mid-1;
		}
	}
	System.out.println(index);
}
}
