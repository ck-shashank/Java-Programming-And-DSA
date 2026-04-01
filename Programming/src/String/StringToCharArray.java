package String;

public class StringToCharArray {
  public static void main(String[] args) {
	String str="abc";
	System.out.println(str);
	char [] ch= str.toCharArray();
	System.out.println(ch.length);
	for(char c:ch) {
		System.out.println(c);
	}
	// string to string array
	str="This is me";
	System.out.println(str);
	String [] arr=str.split(" ");
	for(String s:arr) {
		System.out.println(s);
	}
}
}
