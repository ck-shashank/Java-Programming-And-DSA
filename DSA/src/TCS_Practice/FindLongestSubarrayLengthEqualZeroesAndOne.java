package TCS_Practice;

public class FindLongestSubarrayLengthEqualZeroesAndOne {
public static void main(String[] args) {
	int [] arr={1,0,1,0,1,1,0,0,1,1} ;
    int max=0;
    for(int i=0;i<arr.length;i++){
        int c0=0;
        int c1=0;
        for(int j=i;j<arr.length;j++){
            if(arr[j]==0) c0++;
            else c1++;
            if(c1==c0){
                if(max<c1+c0){
                    max=c1+c0;
                }
            }
        }
    }
    System.out.println(max);
}
}
