package Array;

public class SecMax {


		public static void main(String[] args) {
			int [] arr= {8,2,3,8,6,4};
			 int max=arr[0]; int secmax=arr[0];
			 for(int i=0;i<arr.length;i++) {
				 if(arr[i]>max) {
					 secmax=max;
					 max=arr[i];
				 }
				 else if(arr[i]>secmax||max==secmax) {
					 if(arr[i]!=max) {
						 secmax=arr[i];
					 }
				 }
			 }
			 System.out.println("max : "+max);
			 System.out.println("scMax : "+ secmax);
			
		}

	}


