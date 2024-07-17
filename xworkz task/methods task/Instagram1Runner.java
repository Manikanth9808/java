class Instagram1Runner{

	public static void main(String[] newAccount){
		
	boolean isLoginsuccess =	Instagram1.instaLogin("Manikanth","Pattar",9632084956L,"Manikanthpattar0@gmail.com","mani@123","mani@123");
		
		if(isLoginsuccess != false){
		       Instagram1.login();
		}else{
			System.out.println("Provided Details Not Found");
		}
	}




}