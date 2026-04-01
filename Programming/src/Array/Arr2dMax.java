package Array;

public class Arr2dMax {
   public static void main(String[] args) {
	int [][] arr= {{1,2,3},{7,6,2},{8,9,5}};
	int []  res= new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		int max=arr[i][0];
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]>max) {
				max=arr[i][j];
			}
		}
		res[i]=max;
	}
	for (int i = 0; i < res.length; i++) {
		System.out.print(res[i]+" ");
	}
	
}
   
}
