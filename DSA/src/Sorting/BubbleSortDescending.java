package Sorting;

public class BubbleSortDescending {
  public static void main(String[] args) {
	int[] arr= {-3,4,5,1,9,-2,8,6};
	boolean flag;
	for(int i=0;i<arr.length-1;i++) {
		flag=false;
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
			}
			if(!flag) break;
		}
	}
	for(int i:arr) {
		System.out.print(i+" ");
	}
}
}
