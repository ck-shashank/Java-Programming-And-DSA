package Number;

public class Demo {
 public static void main(String[] args) {
     int bin=1111;
     int num=0;
     int i=1;
     while(bin!=0){
    	 int rem=bin%10; 
    	  num=num+i*rem;
    	 i=i*2;
    	 bin=bin/10;	 
     }
     System.out.println(num);
  }                                                  
}
