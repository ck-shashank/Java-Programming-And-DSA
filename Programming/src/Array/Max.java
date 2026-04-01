package Array;

public class Max {
	public static void main(String[] args) {
		int [] arr= {1,2,3,8,6,4};
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println("max : "+max);
		
	}

}
