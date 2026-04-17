package TCS_Practice;

public class ParkingRow {
public static void main(String[] args) {
	int arr[][]= {{1,0,1,0},{1,1,0,1},{0,1,1,0}};
	int count=0;
	int row=-1;
	for(int i=0;i<arr.length;i++) {
		int c=0;
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==1) {
				c++;
			}
		}
		if(count<c) {
			count=c;
			row=i;
		}
	}
	System.out.println(row);
}
}
