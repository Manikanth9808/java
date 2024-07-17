class Instagram1{
	
	static String name;
	static String lastName;
	static long phoneNo ;
	static String email;
	static String enterPassword;
	static String confmPassword;
	
	public static boolean instaLogin(String nameIs , String lastNameIs , long mobileNo , String gmail, String password , String cnfPassword){
			boolean isLoginsuccess = false;
			boolean isNameValid = false;
			boolean isLastNameValid = false;
			boolean isCellNoValid = false;
			boolean isGmailValid = false;
			boolean isPasswordValid = false;
			boolean isPasswordMatching = false;
			
			if(nameIs != null){
				name=nameIs;
				isNameValid = true;
			}else{
				System.out.println("Please Provide Valid Name");
			}
			if(lastNameIs != null){
				lastNameIs=lastNameIs;
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
			
			System.out.println("user name is = "+name);
			System.out.println("user last name is= "+lastName);
			System.out.println("mobile number is = "+phoneNo);
			System.out.println("enter gmail = "+email);
			System.out.println("create password = "+enterPassword);
			System.out.println("Confirm Password = "+confmPassword);
			
			
		}





}