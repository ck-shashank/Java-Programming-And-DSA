package Array;
//{1,2,3,4,5,6} -> given array, user input=2
//{5,6,1,2,3,4} -> res array	
public class RIghtRotation {
	public static void main(String[] args) {
		
	
	int [] arr= {1,2,3,4,5,6};
	int userinput=2;
	int [] res=new int[arr.length];
	int j=0;
	for(int i=arr.length-userinput;i<arr.length;i++) {
		res[j]=arr[i];
		System.out.println(res[j]);
		j++;
	}
	for(int i=0;i<arr.length-userinput;i++) {
		res[j]=arr[i];
		System.out.println(res[j]);
		j++;
	}
	}

}
