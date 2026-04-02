package Array;
// sum of two elements ==target print true if not then print false
public class TwoSum {
	public static void main(String[] args) {
		int target=9;
	
    int[] arr= {-3,2,4,5};
    for(int i=0;i<arr.length;i++) {
    	for(int j=1+1;j<arr.length;j++) {
    		if(arr[i]+arr[j]==target) {
    			System.out.println(true);
    			return;
    		}
    		
    	}
    }
    System.out.println(false);
	}
}
