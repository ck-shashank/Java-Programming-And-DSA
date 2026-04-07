package Sorting;
//if multiple targets are present then return the smallest index
public class BinarySearch {
  public static void main(String[] args) {
	int arr[]= {1,2,7,10,16,20};
	int low=0;
    int high=arr.length-1;
    int k=2;
    int index=-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==k){  
            index=mid;
            high=mid-1;
        }
        else if(arr[mid]>k){
            high=mid-1;
        }
        else low=mid+1;
    }
	
	
	System.out.println(index);
	
	
	
	
}
}
