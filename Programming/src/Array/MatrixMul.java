package Array;

 

public class MatrixMul {
 public static void main(String[] args) {
	 int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
	  int [][] b= {{1,2,1},{2,3,1},{1,2,3}};
	  int [][] res= new int [a.length][b.length];
	  
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<b.length;j++) {
			 for(int k=0;k<res.length;k++) {
				 res[i][j]= res[i][j]+ a[i][k]*b[k][j];
			 }
		  }
	  }
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<b.length;j++) {
			 System.out.print(res[i][j]+" ");
	}
		  System.out.println();
 }
}
}

