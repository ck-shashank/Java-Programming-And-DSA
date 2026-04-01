package String;

public class Palindrome {
  public static void main(String[] args) {
	String str="MaLAYAlAm";
	System.out.println(str);
	if(palindrome(str)) {
		System.out.println("Paindrome");
	}
	else 
		System.out.println("not palindrome");
}
  public static boolean palindrome(String str) {
	  str=str.toUpperCase();
	  int i=0;
	  int j=str.length()-1;
	  while(i<j) {
		  if(str.charAt(i)!=str.charAt(j)) {
			  return false;
		  }
		  i++;
		  j--;
	  }
	  return true;
  }
}
