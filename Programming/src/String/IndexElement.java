package String;

public class IndexElement {
	public static void main(String[] args) {
		String s="JAVAPROGRAM";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("-------------");
		System.out.print("Char at prime index: ");
		for (int i = 2; i < s.length(); i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) count++;
			}
			if(count==2) {
				System.out.print(s.charAt(i)+" ");
			}
			 
		}
	}

}
