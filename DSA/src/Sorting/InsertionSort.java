package Sorting;

public class InsertionSort {
public static void main(String[] args) {
	int [] arr= {3,6,9,4,8,2,1};
	insertionSort(arr);
	for (int i : arr) {
		System.out.print(i+" ");
	}
}

private static void insertionSort(int[] arr) {
 for(int i=1;i<arr.length;i++) {
	 int j=i;  
	 while( j>0 && arr[j]<arr[j-1]) {
		 int temp=arr[j];
		 arr[j]=arr[j-1];
		 arr[j-1]=temp;
		 j--;
	 }
	  
	
	 
 }
}
}

