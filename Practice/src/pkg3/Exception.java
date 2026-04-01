package pkg3;

public class Exception {
	public static void main(String[] args) {
		System.out.println("Start");
		
	try {
			//System.out.println(4/0);
		throw new NullPointerException();
		
	}
	catch(NullPointerException e){
					System.out.println("Exception is handled");	
	}
		System.out.println("End");
	}

}
