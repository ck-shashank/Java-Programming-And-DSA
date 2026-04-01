package Array;
public class Demo {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int [] res = new int[arr.length];

        // Two-loop method
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j >= 0; j--) {
                if(i + j == arr.length - 1) {   // condition to map positions
                    res[j] = arr[i];
                }
            }
           
          }
        
        for(int k=1;k<arr.length;k++) {
      	  System.out.println(res[k]);

    }
}
}

        // print result
         
        
    
