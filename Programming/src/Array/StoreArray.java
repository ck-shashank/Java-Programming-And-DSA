package Array;

public class StoreArray {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int res[]= new int[arr.length]; 
		int j=0;
		for(int i=0;i<arr.length;i++) {
			res[j]=arr[i];
			System.out.print(res[j]+" ");
			j++;
			
		}
	} 

}
