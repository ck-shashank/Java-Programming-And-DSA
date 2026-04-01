package Array;

public class SwapOddIndexElement {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10,11};
		int i=1;
		while(i+2<arr.length) {
			int temp=arr[i];
			arr[i]=arr[i+2];
			arr[i+2]=temp;
			i+=4;
			
		}
		 
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+ " ");
		}
	}

}
