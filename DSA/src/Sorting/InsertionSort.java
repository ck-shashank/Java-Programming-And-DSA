package Sorting;

public class InsertionSort {
public static void main(String[] args) {
	int [] arr= {3,6,9,4,8,2,1};
	insertionSort(arr);
	for (int i : arr) {
		System.out.println(i);
	}
}

private static void insertionSort(int[] arr) {
 for(int i=1;i<arr.length;i++) {
	 int j=i-1; int key=arr[i];
	 while(j>-1 && arr[j]>key) {
		 arr[j+1]=arr[j];
		 j--;
	 }
	 arr[j+1]=key;
 }
}
}
