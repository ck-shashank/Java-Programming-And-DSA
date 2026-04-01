package pkg1;

public class FB {
	
		String username;
		long mob;
		int pass;
		String email;
		public FB(String username,long mob,int pass,String email){
			this.username=username;
			this.mob=mob;
			this.pass=pass;
			this.email=email;
		}
		public void details(){
			System.out.println("UserName: "+username);
			System.out.println("Mob: "+mob);
			System.out.println("Pass: "+pass);
			System.out.println("email: "+email);
			
	       
		}
		public void updateUn(String newusername,int pass){
			if(pass==this.pass){
				this.username=newusername;
			}
			else{
				System.out.println("invalid password");
			}
		}
		public static void main(String[] args) {
			 FB f1=new FB("chandan",854154L,1234,"abc");
			 f1.details();
			 f1.updateUn("ck",1234);
			 System.out.println("--------------");
			 f1.details();
			 f1.updateUn("ck",134);
		}
	}


