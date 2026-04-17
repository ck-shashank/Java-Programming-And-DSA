package TCS_Practice;

public class CamelCaseToLoweCaseWithSpace {
public static void main(String[] args) {
	String str="IAmADiscoDancer";
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		 
			if(Character.isUpperCase(ch)) {
				if(i!=0)  sb.append(" ");
				sb.append(Character.toLowerCase(ch));
			}
			else sb.append(ch);
		}
	System.out.println(sb.toString());
	}
	
}

