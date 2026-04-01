package String;

public class ReadCharUsingRecur {
public static void main(String[] args) {
	String str="Hello";
	System.out.println(str);
	print(str,0);
	
}
public static void print(String str,int i) {
	if(i==str.length()) return;
	System.out.print(str.charAt(i));
	print(str,++i);
}
}
