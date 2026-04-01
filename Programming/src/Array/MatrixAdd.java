package Array;

public class MatrixAdd {
	public static void main(String[] args) {
		
	
  int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
  int [][] b= {{1,2,1},{2,3,1},{1,2,3}};
  int [][] res= new int [a.length][b.length];
  
  for(int i=0;i<a.length;i++) {
	  for(int j=0;j<b.length;j++) {
		 res[i][j] =a[i][j]+b[i][j];
	  }
  }
  for(int i=0;i<res.length;i++) {
	  for(int j=0;j<res[i].length;j++) {
		  System.out.print(res[i][j]+"  ");
	  }
	  System.out.println();
	}
	}
}
