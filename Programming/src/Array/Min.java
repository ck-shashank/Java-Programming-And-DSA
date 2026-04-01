package Array;

public class Min {
	

	
		public static void main(String[] args) {
			int [] arr= {4,2,3,8,6,4};
			 int min=arr[0];
			 for(int i=0;i<arr.length;i++) {
				 if(arr[i]<min) {
					 min=arr[i];
				 }
			 }
			 System.out.println("min : "+min);
			
		}

	}

