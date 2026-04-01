// program to check whether string is balanced or not
package String;

public class BalancedString {
public static void main(String[] args) {
	String str="[{()}]()";
	System.out.println(str);
	System.out.println(balanced(str));
}
public static boolean balanced(String str) {
	if(str.length()%2!=0) return false;  //odd length string can not be balanced
	while(true)
	{
		int originalLength=str.length();
		str=str.replace("()", "");
		str=str.replace("[]", "");
		str=str.replace("{}", "");
		int newLength=str.length();
		if(newLength==originalLength) break;
		
	}
	return str.length()==0;  
			}
}
