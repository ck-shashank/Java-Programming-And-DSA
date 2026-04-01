package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPattern {
  public static void main(String[] args) {
	  String pattern="ab";
	Pattern p=Pattern.compile(pattern);
	Matcher m=p.matcher("ab#abc*abc$");
	int freq=0;
	while(m.find()) {
		freq++;
		System.out.println(m.start()+"->"+m.end()+"->"+m.group());
	}
	System.out.println("Frequency is "+freq);
}
}
