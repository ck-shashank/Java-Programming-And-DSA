package String;

public class Replace {
 public static void main(String[] args) {
	char oldChar='a';
	char newChar='$';
	String str="Malayalam";
	System.out.println(str);
	System.out.println(replace(newChar,oldChar,str));
}
 public static String replace(char newChar,char oldChar,String str) {
	 String result="";
	 for (int i = 0; i < str.length(); i++) {
		 if(str.charAt(i)==oldChar) {
			 result+=newChar;
		 }
		 else
			 result+=str.charAt(i);
		
	}
	 return result;
 }
}
