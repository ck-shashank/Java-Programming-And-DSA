package Array; 
//Multiply odd indexed element by 2 and add 10 to even indexed elements
public class ArrayPractice1 {
	public static void main(String[] args) {
		
	
    int[] arr= {1,2,3,4,5,6};
     
    for(int i=0;i<arr.length;i++) {
    	if(i%2==0) {
    		arr[i]+=10;
    	}
    	else {
    		arr[i]*=2;
    	}
    }
     for(int i: arr) {
    	 System.out.print(i +" " );
     }
	}
}
