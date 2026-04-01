package String;

public class MaxFreqChar {
    public static void main(String[] args) {
    	String str="abcabac";
   	    int maxFreq=0;
   	    char maxChar=' '; 
    	for(int i=0;i<str.length();i++)
    	{
    		int freq=0;
    		for(int j=0;j<str.length();j++) {
    			if(str.charAt(i)==str.charAt(j)) {
    				freq++;
    			}
    		}
    		 if(freq>maxFreq) {
    			 maxFreq=freq;
    			 maxChar=str.charAt(i);
    		 }
    	}
    	System.out.println(maxChar+" occurence ---> "+ maxFreq);
	}
}
