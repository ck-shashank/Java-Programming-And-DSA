package String;

public class Remove { 
		public static void main(String[] args){
		String str="Chandan";
		 StringBuilder result=new StringBuilder();
		 for(int i=0;i<str.length();i++){

		    char ch=str.charAt(i);
		  if(result.indexOf(String.valueOf(ch))==-1){
		     result.append(ch);
		}
		}
		  System.out.println("Original "+ str);
		  System.out.println("After " + result.toString()); 
		}

		}
		
 
