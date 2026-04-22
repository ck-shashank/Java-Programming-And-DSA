package TCS_Practice;

import java.util.Scanner;

public class ValidCapitalization {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a word");
	String str=sc.next();
	 if(allCapital(str)|| allSmall(str)|| allSmall(str.substring(1))) {
		 System.out.println(true);
	 }
	 else {
		 System.out.println(false);
	 }
}

private static boolean allCapital(String str) {
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i) <'A' ||str.charAt(i)>'Z')  return false;
	 }
	return true;
}
private static boolean allSmall(String str) {
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i) <'a' ||str.charAt(i)>'z')  return false;
	 }
	return true;
}
}
