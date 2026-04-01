package Array;

public class ReverseInTwoHalf {
public static void main(String[] args) {
	int num=121313;
	 System.out.println(num);
	 reverse(num);
}
public static void reverse(int num) {
	int count=0; int temp=num;
	while(num!=0) {
		count++;
		num=num/10;
	}
	if(count%2!=0) { System.out.println("odd length number"); 
	return;}
	int [] arr=new int[count];
	num=temp;
	int i=0;
	while(num!=0) {
		int rem=num%10;
		arr[i]=rem;
		
		i++;
		num=num/10;
	}
	if(arr[0]==0) {System.out.println("number started with zero -- >invalid");return;}
	//else {
	i=0;int j=arr.length/2 -1;
	while(i<j) {
		if(arr[i]!=arr[j]) { System.out.println("not palindrome"); return;}
		else {
		i++;
		j--;
		}
	}
	
	i=arr.length/2; j=arr.length-1;
	while(i<j) {
		if(arr[i]!=arr[j]) {System.out.println("not palindrome"); return;}
		else {
		i++;
		j--;
		}
	}
	System.out.print("new number: ");
	for(int k=0;k<arr.length;k++) {
		System.out.print(arr[k]);
	}
}
}
//}
