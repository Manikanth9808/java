class Amazon1Runner{

	public static void main(String[] newAccount){
		
	boolean isLoginsuccess =Amazon1.login("Manikanth","Pattar","kalaburagi","kalaburagi",6361273857L,"mani@123");
		
		if(isLoginsuccess ==true){
		       Amazon1. accountInfo();
		}else{
			System.out.println("Provided Details Not Found");
		}
	}




}