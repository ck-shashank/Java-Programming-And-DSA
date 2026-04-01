package String;

public class VowelCount {
 public static void main(String[] args) {
	String str="Programming";
	str=str.toLowerCase();
	int vowel=0;
	int consonant=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&& ch<='z')
		switch (ch) {
		case 'a','e','i','o','u' : vowel++; break;
		default : consonant++;		
		}
	}
	System.out.println("Vowel :"+vowel);
	System.out.println("Consonant :"+consonant);
}
}
