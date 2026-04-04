package Array;
//move all 0s to left maintain the order of non zeroes element
public class Move0sToLeft {
public static void main(String[] args) {
	int[] arr= {0,1,0,3,1,0,7};
	int j=arr.length-1;
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]!=0) {
			if(i!=j) {
			  int temp=arr[j];
			  arr[j]=arr[i];
			  arr[i]=temp;
			  
			}
			j--;
		}
	}
 
	for(int ele: arr) {
		System.out.print(ele+" ");
	}
}
}
