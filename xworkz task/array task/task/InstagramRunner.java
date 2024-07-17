class InstagramRunner{

	public static void main(String[] newAccount){
		
	boolean isLoginsuccess =	Instagram.instaLogin("CHANNVEER","CH",9632084956L,"channu@gamil.com","channu@123","channu@123");
		
		if(isLoginsuccess == true){
		       Instagram.login();
		}else{
			System.out.println("Provided Details Not Found");
		}
	}




}