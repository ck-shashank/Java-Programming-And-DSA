 package Number;
import java.util.Scanner;
public class LargeSmallPrime {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int smallestPrime=0;
		int largestPrime=0;
		
		System.out.println("Enter Lower-Range");
		int lower=sc.nextInt();
		System.out.println("Enter Upper Range");
		int upper=sc.nextInt();
		for(int j=lower;j<=upper;j++) {
			int count=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0) count++;
			}
			if(count==2) {
				if(smallestPrime==0)
				 smallestPrime=j;
				largestPrime=j;
			}
		}
		
        System.out.println(smallestPrime);
        System.out.println(largestPrime);
		 System.out.println(smallestPrime+largestPrime);
		sc.close();
	}
}
