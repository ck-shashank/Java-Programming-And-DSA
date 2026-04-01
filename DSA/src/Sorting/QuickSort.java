package Sorting;

public class QuickSort {
  public static void main(String[] args) {
	int [] arr= {4,9,3,7,1,10,2};
	quickSort(arr,0,arr.length-1);
	 for(int num:arr) {
		 System.out.println(num);
	 }
}

  private static void quickSort(int[] arr, int start, int end) {
	 if(start>=end) return;
	 int i=start;int j=end;
	 int pivot=arr[(start+end)/2];
	 while(i<=j) {
		 while(arr[i]<pivot) i++;
		 while(arr[j]>pivot) j--;
		  if(i<=j){
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			  i++;j--;
		  }
	 }
	 quickSort(arr, start, j);
	 quickSort(arr, i, end);
	 
  }
}
