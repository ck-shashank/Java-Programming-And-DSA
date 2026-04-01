package RegEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPattern {
  public static void main(String[] args) {
	  String pattern="[0-9A-Za-z]";
	  String target="a1B2# 3$D8*c";
	Pattern p=Pattern.compile(pattern);
	Matcher m=p.matcher(target);
	int freq=0;
	while(m.find()) {
		freq++;
		System.out.println(m.start()+"->"+m.end()+"->"+m.group());
	}
	System.out.println("Frequency is "+freq);
}
}
