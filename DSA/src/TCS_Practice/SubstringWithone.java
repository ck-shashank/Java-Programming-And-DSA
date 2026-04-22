package TCS_Practice;

public class SubstringWithone {
public static void main(String[] args) {
	String str="100111001111";
	int count=0;
	int res=0;
	for(char ch: str.toCharArray()) {
		if(ch=='1') {
			count++;
			res+=count;
		}
		else count=0;
	}
	System.out.println(res);
}
}
