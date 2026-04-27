package TCS_Practice;
import java.util.*;
//input:
//	5
//	10 2
//	20 1
//	30 0
//	40 2
//	50 1
//	3
//	10
//	40
//	50

// output 12;
//10 → 2 (High)
//20 → 0 (Out of stock)
//30 → 1 (Medium)
//40 → 2 (High)
//50 → 1 (Medium)

//10 → 2 (High)
//20 → 0 (Out of stock)
//30 → 1 (Medium)
//40 → 2 (High)
//50 → 1 (Medium)

public class Availability {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	HashMap<Integer, Integer> map =new HashMap<Integer, Integer>();
	
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int key=sc.nextInt();
		int val=sc.nextInt();
		map.put(key, val);
	}
	System.out.println("Enter query");
	int m=sc.nextInt();
	int sum=0;
	for(int i=0;i<m;i++) {
		int query=sc.nextInt();
		int val=map.getOrDefault(query,0);
		if(val==2) sum+=5;
		if(val==1)sum+=2;
	}
	System.out.println(sum);
}
}
