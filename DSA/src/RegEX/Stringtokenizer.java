package RegEX;

import java.util.StringTokenizer;

public class Stringtokenizer {
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("Welcome to Hyderabad");
	while(st.hasMoreElements()) {
		System.out.println(st.nextElement());
	}
	StringTokenizer st1=new StringTokenizer("06-10-2025","-");
	while(st1.hasMoreElements()) {
		System.out.println(st1.nextElement());
	}
}
}
