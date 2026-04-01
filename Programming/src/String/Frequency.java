package String;

public class Frequency {
  public static void main(String[] args) {
	String str="Java";
	 
	for(int i=0;i<str.length();i++)
	{
		int freq=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				freq++;
			}
		}
		System.out.println(str.charAt(i) +"-->"+freq);
	}
}
}
