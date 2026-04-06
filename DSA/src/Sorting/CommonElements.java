package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

//Given two integer arrays a[] and b[]. 
//Return the list of elements common to both the lists and 
//return the list in sorted order. Duplicates may be there in the output list.
public class CommonElements {
public static void main(String[] args) {
	int a[]= {3, 6, 1, 7, 9, 8, 2, 2};
	int b[]= {9, 7, 3, 4, 9};
	ArrayList<Integer> res= new ArrayList<Integer>();
	int i=0; int j=0;
	Arrays.sort(a);
	Arrays.sort(b);
	 while(i<a.length && j<b.length){
         if(a[i]==b[j]) {
             res.add(a[i]);
             i++; j++;
             
         }
         else if(a[i]<b[j]){
             i++;
         }
         else j++;
     }
       System.out.println(res);
}
}
