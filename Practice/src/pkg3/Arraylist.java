package pkg3;

import java.util.ArrayList;

 

public class Arraylist {
	public static void main(String[] args) {
		
	
   ArrayList<Integer> a1= new ArrayList<>();
  for(int i=0;i<10;i++) {
	  a1.add(i);
  }
  a1.set(4,25);
  a1.remove(4);
   System.out.println(a1);
}
	
}
