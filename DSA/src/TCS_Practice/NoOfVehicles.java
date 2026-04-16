package TCS_Practice;

import java.util.*;

//no of vehicles are given as v, no of wheels are given as w, find no of two wheeler and four wheeler , print -1 in case of invalid data
public class NoOfVehicles {
public static void main(String[] args) {
	Scanner sc= new  Scanner(System.in);
	System.out.println("Enter number of vehicle");
	int v=sc.nextInt();
	System.out.println("Enter number of wheel");
	int w=sc.nextInt();
	
	int x;  //number of two wheeler 
	int y; // number of four wheeler
	
	if(w<2*v || w>4*v || w%2!=0) {
		System.out.println("invalid data " + -1);
		
	}
	else {
		y=(w-2*v)/2;
		x=(4*v-w)/2;
		System.out.println("Two wheeler :"+ x + " Four Wheeler :"+y);
	}
}
}
