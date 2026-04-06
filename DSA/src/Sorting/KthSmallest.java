package Sorting;
//distinct elements 
public class KthSmallest {
public static void main(String[] args) {
	int arr[]= {9,7,1,4,6,8,5,3,2};
	int k=4;
	for(int i=0;i<k;i++) {
		int min=Integer.MAX_VALUE;
		int l=-1;
		for(int j=i;j<arr.length;j++) {
			
			if(arr[j]<min) {
				min=arr[j];
				l=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[l];
		arr[l]=temp;
	}
	System.out.println(arr[k-1]);
}
}
