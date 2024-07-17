class Instagram{
	
	static String nameIs;
	static String lastNameIs;
	static long phoneNo ;
	static String email;
	static String enterPassword;
	static String confmPassword;
	
	public static boolean instaLogin(String name , String lastName , long mobileNo , String gmail, String password , String cnfPassword){
			boolean isLoginsuccess = false;
			boolean isNameValid = false;
			boolean isLastNameValid = false;
			boolean isCellNoValid = false;
			boolean isGmailValid = false;
			boolean isPasswordValid = false;
			boolean isPasswordMatching = false;
			
			if(name != null){
				nameIs=name;
				isNameValid = true;
			}else{
				System.out.println("Please Provide Valid Name");
			}
			if(lastName != null){
				lastNameIs=lastName;
				isLastNameValid = true;
			}else{
				System.out.println("Please Enter Last Name");
			}
			if(mobileNo > 0){
				phoneNo=mobileNo;
				isCellNoValid = true;
			}else{
				System.out.println("Phone Number is not Valid");
			}
			if(gmail!= null){
				email=gmail;
				isGmailValid = true;
			}else{
				System.out.println("Please Valid G-Mail");
			}
			if(password != null){
				enterPassword = password;
				isPasswordValid = true;
			}else{
				System.out.println("Password NOT Valid");
			}
			if(cnfPassword == password){
				confmPassword = cnfPassword;
				isPasswordMatching = true;
			}else{
				System.out.println("Password is not Matching");
			}
			if( isNameValid && isLastNameValid && isCellNoValid && isGmailValid &&  isPasswordValid && isPasswordMatching){
				isLoginsuccess = true;
			}
			return isLoginsuccess;
	}

		public static void login(){
			
			System.out.println("USER NAME IS = "+nameIs);
			System.out.println("USER LAST NAME IS= "+lastNameIs);
			System.out.println("ENTER MOBILE NUMBER = "+phoneNo);
			System.out.println("ENTER GMAIL = "+email);
			System.out.println("CREAT PASSWORD = "+enterPassword);
			System.out.println("CONFORM PASSWORD = "+confmPassword);
			
			
		}





}