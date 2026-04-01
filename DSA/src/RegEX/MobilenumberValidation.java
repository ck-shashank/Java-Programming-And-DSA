package RegEX;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobilenumberValidation {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	Pattern pattern=Pattern.compile("(0|91)?[6-9][0-9]{9}");
	System.out.println("Enter mobile number");
	String t=sc.next();
	Matcher matcher=pattern.matcher(t);
	while(matcher.find()) {
		System.out.println(matcher.group());
	}
	sc.close();
}
}
