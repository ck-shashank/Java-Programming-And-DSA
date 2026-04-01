package String;

public class Vowel {
 public static void main(String[] args) {
	String str="Programming";
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		switch (ch) {
		case 'a','e','i','o','u' : System.out.println(ch);
		}
	}
}
}
