package Sorting;
//You have n coins and you want to build a staircase with these coins. 
//The staircase consists of k rows where the ith row has exactly i coins. 
//The last row of the staircase may be incomplete.
public class ArrangingCoins {
public static void main(String[] args) {
	int n=98765;
	
	// with inbuilt function
//	long m=(long)n;
//	int row= (int) ((Math.sqrt(8*m+1)-1)/2);
//	System.out.println(row);
	
	//using binary search
	long low=0;long high=n;
	long ans=0;
	while(low<=high) {
		long k=low +(high-low)/2;  // find mid
		long m= k*(k+1)/2; // calculate total sum till mid
		if(n==m) {  //if equal than return 
			ans=k;
			break;
		}
		else if(m>n) { //if sum> n than number of row will be less
			high=k-1;
		}
		else {
			ans=k;
			low=k+1;
		}
	}
	System.out.println((int)ans);
}
}
