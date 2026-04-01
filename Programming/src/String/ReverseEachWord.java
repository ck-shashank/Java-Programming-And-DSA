package String;

public class ReverseEachWord {
  public static void main(String[] args) {
	String str="High level programming language";
	System.out.println(str);
	String [] arr=str.split(" ");
	String result="";
	for(int i=0;i<arr.length;i++) {
		if(i==arr.length) result+=reverse(arr[i]);
		else result+=reverse(arr[i])+" ";
	}
	System.out.println(result);
}
  public static String reverse(String str) {
	  String res="";
	  for(int i=str.length()-1;i>=0;i--) {
		  res+=str.charAt(i);
	  }
	  return res;
  }
}
