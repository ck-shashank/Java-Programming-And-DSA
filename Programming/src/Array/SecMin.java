package Array;

public class SecMin {
	 

			public static void main(String[] args) {
				int [] arr= {1,2,3,8,1,4};
				 int min=arr[0]; int secmin=arr[0];
				 for(int i=0;i<arr.length;i++) {
					 if(arr[i]<min) {
						 secmin=min;
						 min=arr[i];
					 }
					 else if(arr[i]<secmin||min==secmin) {
						 if(arr[i]!=min) {
							 secmin=arr[i];
						 }
					 }
				 }
				 System.out.println("min : "+min);
				 System.out.println("scMin : "+ secmin);
				
			}

		}



	

