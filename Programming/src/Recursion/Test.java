package Recursion;

public class Test {
       public static void print(int i,int num) {
    	   if(i>num) return;
    	   System.out.println(i);
    	   print(++i,num);
    		   
    	   }
       public static void main(String[] args) {
		print(1,3);
	}
       }


