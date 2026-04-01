package String;

public class ReverseRecurssion {
public static void main(String[] args) {
	String str="java";
	System.out.println(str);
	int i=str.length()-1;

	str=reverse(i,str);
	System.out.println(str);
}
public static String reverse(int i,String str){
	 if(i<0) return "";
	 
	 return str.charAt(i)+ reverse(--i,str);
	 
}
}
