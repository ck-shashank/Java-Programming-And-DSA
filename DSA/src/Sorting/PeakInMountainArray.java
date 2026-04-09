package Sorting;
//You are given an integer mountain array arr of 
//length n where the values increase to a peak element 
//and then decrease.

//Return the index of the peak element.
public class PeakInMountainArray {
public static void main(String[] args) {
	int arr[]= {1, 2, 4, 5, 7, 8, 3};
	int low=1;
     
    int high=arr.length-2;
    int n = arr.length;
    
    if(n == 1) System.out.println(0);
    
    // check boundaries
    else if(arr[0] > arr[1]) { System.out.println(0); 
     }
    else if(arr[n-1] > arr[n-2]) System.out.println(arr.length-1);
    else {
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
             System.out.println(mid);
            break;
        }
        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
            low=mid+1;
        }
        else high=mid-1;
    }
    }
}
}
