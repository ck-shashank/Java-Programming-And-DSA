package TCS_Practice;

public class MoveMultipleOfTenToEnd {
   public static void main(String[] args) {
	
	   int [] arr= {12,10,20,45,43,40,30,60,30,45};
	    // preserve order of element not divisible by 10;
	   
	   int j=0;;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]%10!=0) {
			   if(i!=j) {
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			   }
			   j++;
		   }
	   }
	   for(int i:arr) {
		   System.out.print(i+" ");
	   }
}
}
