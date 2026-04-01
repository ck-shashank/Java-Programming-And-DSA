package pkg3;

import java.util.ArrayList;

public class Returnarraylist {
	public static void main(String[] args) {
		 ArrayList<Integer> a1 =new ArrayList<>();
		 a1.add(10);
		 a1.add(34);
		 a1.add(25);
		 a1.add(52);
		 System.out.println(a1);
		 System.out.println(returnEven(a1));
		 
	}
	public static ArrayList<Integer> returnEven(ArrayList<Integer> input){
		ArrayList<Integer> a1= new ArrayList<Integer>();
		for(Integer n: input) {
			if(n%2==0) {
				a1.add(n);
			}
		}
		return a1;
	}

}
