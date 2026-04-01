package Array;
//pascal triangle
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1

 

public class PascalTriangle {
	public static void main(String[] args) {
		int size=5;
		int [][] arr=pascalTriangle(size);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] pascalTriangle(int size){
	int [][] arr=new int[size][];
   for(int i=0;i<arr.length;i++) {
	   arr[i]=new int[i+1];
	   for(int j=0;j<arr[i].length;j++) {
		   if(j==0||i==j) {
			   arr[i][j]=1;
		   }
		   else
			   arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
	   }
   }
 return arr;
	}
}

