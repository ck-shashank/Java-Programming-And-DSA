package Sorting;

public class MaxCountPosandNegInteger {
   public static void main(String[] args) {
	   int nums[] = {-2,-1,-1,0,0,1,2,3,4};
	   int pos=-1;
       int neg=-1;
   
   int l=0;
   int h=nums.length-1;

      while(l<=h){
       int mid=(l+h)/2;
       if(nums[mid]<0){
           neg=mid;
           l=mid+1;
       }
       else  
           h=mid-1;
      }
        int l1=0;
   int h1=nums.length-1;

      while(l1<=h1){
       int mid=(l1+h1)/2;
       if(nums[mid]>0){
           pos=mid;
           h1=mid-1;
       }
       else  
          l1= mid+1;
      }
      pos=(pos == -1) ? 0 : nums.length - pos;
      neg=neg+1;
      System.out.println(Math.max(pos,neg));
}
}
