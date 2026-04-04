package Array;
//move all 0s to right and non zero to left such that non zero is maintaing their order
public class MoveAllZeroesToRight {
	public static void main(String[] args) {
		
	
 int[] nums= {0,1,0,3,1,2};
 int j=0;
 for(int i=0;i<nums.length;i++){
    if(nums[i]!=0){
    	if(i!=j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    	}
        j++;
    }
 }
 for(int e: nums) {
	 System.out.print(e+" ");
 }
	}
}
