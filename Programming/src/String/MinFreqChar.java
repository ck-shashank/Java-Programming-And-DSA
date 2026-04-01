package String;

public class MinFreqChar {
	public static void main(String[] args) {
		String str="Programming";
		int minFreq=str.length();
		char minChar=' ';
		for (int i = 0; i < str.length(); i++) {
			int freq=0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					freq++;
				}
			}
			if(freq<minFreq) {
				minFreq=freq;
				minChar=str.charAt(i);
			}
			
		}
		System.out.println(str);
		System.out.println(minChar+ " occurence ---> "+minFreq);
		
	}

}
