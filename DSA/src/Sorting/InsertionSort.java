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
// for(int i=1;i<arr.length;i++) {
//	 int j=i-1; int key=arr[i];
//	 while(j>-1 && arr[j]>key) {
//		 arr[j+1]=arr[j];
//		 j--;
//	 }
//	 arr[j+1]=key;
	
	int k=0;
	for(int i=0;i<arr.length-1;i++) {
		int min=Integer.MAX_VALUE;
		 for(int j=i;j<arr.length;j++) {
			 if(arr[j]<min) {
				 min=arr[j];
				 k=j;
			 }
		 }
		 int temp=arr[i];
		 arr[i]=arr[k];
		 arr[k]=temp;
	}
 }
}

