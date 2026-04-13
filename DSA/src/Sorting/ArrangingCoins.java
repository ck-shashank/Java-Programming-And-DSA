package Sorting;
//You have n coins and you want to build a staircase with these coins. 
//The staircase consists of k rows where the ith row has exactly i coins. 
//The last row of the staircase may be incomplete.
public class ArrangingCoins {
public static void main(String[] args) {
	int n=98765;
	long m=(long)n;
	int row= (int) ((Math.sqrt(8*m+1)-1)/2);
	System.out.println(row);
}
}
