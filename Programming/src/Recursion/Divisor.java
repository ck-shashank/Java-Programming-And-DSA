package Recursion;

public class Divisor {
  public static void main(String[] args) {
	int num=6; int i=1;
	div(num,i);
}
  public static void div(int num, int i) {
	  if(i>num) return;
	/*  if(num%i==0) {
		  System.out.println(i);
		  } 
		  div(num,++i);*/
	 else if(num%i==0) {
		  System.out.println(i);
		  div(num,++i);
	  }
	  else {
		  div(num,++i);
	  }
	  
  }
}
