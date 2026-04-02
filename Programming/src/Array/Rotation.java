package Array;
//rotation of array without taking other array
public class Rotation {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6};
	int d=2;
	 d=d%arr.length;
     rev(arr,0,d-1);
     rev(arr,d,arr.length-1);
     rev(arr,0,arr.length-1);
     for(int e: arr) {
    	 System.out.print(e+" ");
     }
}
static int[] rev(int arr[], int start, int end){
    while(start<end){
        int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
    }
    return arr;
    
}
}
