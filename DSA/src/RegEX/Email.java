package RegEX;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Pattern pattern=Pattern.compile("");
		System.out.println("Enter gmail");
		String t=sc.next();
		Matcher matcher=pattern.matcher(t);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		sc.close();
}
}
