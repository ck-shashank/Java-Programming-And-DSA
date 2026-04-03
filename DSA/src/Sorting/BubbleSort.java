package Sorting;

public class BubbleSort {
  public static void main(String[] args) {
	int [] arr= {9,4,5,7,2,6};
	bubbleSort(arr);
	for(int i:arr) {
		System.out.print(i+" ");
	}
}

  public static void bubbleSort(int[] arr) {
	  boolean flag;
	 for(int i=0;i<arr.length;i++) {
		 flag=false;
		 for(int j=0;j<arr.length-1-i;j++) {
			 if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			flag=true;
			 }
		 }
		 if(!flag) break;
	 }
	 
  }
}
