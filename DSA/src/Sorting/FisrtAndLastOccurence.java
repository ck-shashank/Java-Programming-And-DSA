package Sorting;

import java.util.ArrayList;

//Given a sorted array arr with possibly some duplicates, 
//the task is to find the first and last occurrences of an element x
//in the given array.
//Note: If the number x is not found in the array then return
//both the indices as -1.
public class FisrtAndLastOccurence {
	 ArrayList<Integer> find(int arr[], int x) {
	        // code here
	        ArrayList<Integer> res= new ArrayList<Integer>();
	        int lIndex=-1;
	        int rIndex=-1;
	        
	        int low=0;
	        int high=arr.length-1;
	        while(low<=high){
	            int mid=(low+high)/2;
	            if( arr[mid]==x){
	                lIndex=mid;
	                high=mid-1;
	            }
	            else if(arr[mid]<x){
	                low=mid+1;
	            }
	            else high=mid-1;
	        }
	        int low1=0;
	        int high1=arr.length-1;
	        
	        while(low1<=high1){
	            int mid=(low1+high1)/2;
	            if( arr[mid]==x){
	                rIndex=mid;
	                low1=mid+1;
	            }
	            else if(arr[mid]<x){
	                low1=mid+1;
	            }
	            else high1=mid-1;
	        }
	        res.add(lIndex);
	        res.add(rIndex);
	        return res;
	    }
}
