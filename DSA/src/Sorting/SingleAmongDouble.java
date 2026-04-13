package Sorting;
//Given a sorted array arr[]. Find the element that appears only once in the array. 
//All other elements appear exactly twice. 
public class SingleAmongDouble {
public static void main(String[] args) {
	int [] arr= {1,1,2,2,3,3,4,5,5,6,6};
	 int low=0;
	 int high=arr.length-1;
	 while(low<high) {
		 int mid= low+(high-low)/2;
		 if(mid%2==1) mid--;
		 
		 if(arr[mid]==arr[mid+1]) //every element is in pair till mid+1 from low , so check right portion
			 low=mid+2;
		 else  //till mid from low all are not in pair, check left portion
			high=mid; 
	 }
	 System.out.println(arr[low]);
}
}
