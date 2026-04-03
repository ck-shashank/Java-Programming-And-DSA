package Array;
// give an array of length n+1 where 1 to n elements are there find duplicate
public class DuplicateElement {
public static void main(String[] args) {
	int arr[]= {1,5,6,4,3,2,5};
	int n=arr.length-1;
	
	int sum=(n*(n+1))/2;
	int totallSum=0;
	for(int ele: arr) {
		totallSum+=ele;
	}
	System.out.println(totallSum-sum);
}
}
