package Sorting;
//search the element, when array is sorted in descending order using binary search
public class BinarySearchInDiscendingSortedArray {
public static void main(String[] args) {
	int arr[]= {9,8,7,6,4,3,2,1};
	int target=1;
	int high=arr.length-1;
	int low=0;
	while(high>=low) {
		 int mid=(low+high)/2;
		 if(arr[mid]==target) {
			 System.out.println("elemts present at index position: "+mid);
			 break;
		 }
		 else if(arr[mid]>target) {
			  low=mid+1;
		 }
		 else{high=mid-1;
	}
}
}
}
