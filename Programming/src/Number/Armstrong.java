package Number;
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		// count the number of digits
		while(num!=0) {
			num=num/10;
			count++;
		}
		num=temp; // store original number inside num
		int exp=count;
		int sum=0;
		while(num!=0) {
			int base=num%10;
			int power=1;
			for(int i=1;i<=exp;i++) {
				power=power*base;
			}
			sum=sum+power;
			num=num/10;
		}
		if(sum==temp)
			System.out.println(temp+" is an armstrong number");
		else
			System.out.println(temp+" is not an armstrong number");
		sc.close();
		
		
	}
}
