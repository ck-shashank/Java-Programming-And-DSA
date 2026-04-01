package Array;

public class CopyEvenElements {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int res[]= new int[arr.length]; 
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			res[j]=arr[i];
			//System.out.print(res[j]+" ");
			j++;
			}
		}
		for(int k=0;k<j;k++)
		System.out.println(res[k]);
	}

}
