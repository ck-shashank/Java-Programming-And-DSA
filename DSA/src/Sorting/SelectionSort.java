package Sorting;

public class SelectionSort {
public static void main(String[] args) {
	int [] arr= {5,8,6,9,4,3,7};
	selectionSort(arr);
	for(int i:arr) {
		System.out.print(i+" ");
	}
}

  static void selectionSort(int[] arr) {
	 for(int i=0;i<arr.length-1;i++) {
		 int index=i;
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[j]<arr[index]) {
				 index=j;
			 }
		 }
		 if(i!=index) {
			 int temp=arr[i];
			 arr[i]=arr[index];
			 arr[index]=temp;
		 }
	 }
	
}
}
