package TCS_Practice;
//optimal solution
import java.util.HashMap;

public class FindLongestSubarrayOptimal {
public static void main(String[] args) {
	int [] arr={1,0,1,0,1,1,0,0,1,1} ;
	int sum=0;
	int maxLength=0;
	
	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
	map.put(0,-1);
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) sum+=1;
		else sum-=1;
		
		if(map.containsKey(sum)) {
			int prevIndex= map.get(sum);
			int currindex=i;
			maxLength=Math.max(maxLength, currindex- prevIndex);
			
			
		}
		else map.put(sum, i);
	}
	System.out.println(maxLength);
}
}
