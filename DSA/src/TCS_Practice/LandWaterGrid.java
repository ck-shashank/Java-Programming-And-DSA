package TCS_Practice;
//find perimeter of island
public class LandWaterGrid {
public static void main(String[] args) {
	int [][] arr= {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
	
	int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==1) {
				count=count+4;
				if(i!=0 && arr[i-1][j]==1) {
					 count=count-2;
				}
				if(j!=0 && arr[i][j-1]==1) {
					  count=count-2;
				}
			}
		}
	}
	System.out.println(count);
}
}
