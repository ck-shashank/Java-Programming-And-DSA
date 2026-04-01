package RegEX;

import java.util.regex.Pattern;

public class Split {
public static void main(String[] args) {
	Pattern p=Pattern.compile("\\s");
	String [] arr=p.split("Welcome to hyderabad");
	for(String s: arr) {
		System.out.println(s);
	}
	String input="Welcome to hyderabad";
	String [] arr1=input.split(" ");
	for(String s: arr1) {
		System.out.println(s);
	}
}
}
