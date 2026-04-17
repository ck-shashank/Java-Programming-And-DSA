package TCS_Practice;

import java.util.Scanner;

//if number of '*' == number of '#' ten valid string 
// if '*'>'#' --> return +ve int, '*'<'#' --> -ve int, else 0
public class ValidString {
   public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string micxture of * and # no space or any other character");
	String str=sc.next();
	int count=0;
	 
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='*') count++;
		else if(ch=='#')count--;
		else {
			System.out.println("Invalid Character Found");
			return;
		}
	}
	System.out.println(count);
}
   
}
