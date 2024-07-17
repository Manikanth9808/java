class Hospital{
	
	static String name;
	static String lastName;
	static long phoneNo ;
	static String email;
	static int age;
	static String bloodGroup;
	
	public static boolean patientDetails(String nameIs , String lastNameIs , long mobileNo , String gmail, int a , String bG){
			boolean isLoginsuccess = false;
			boolean isNameValid = false;
			boolean isLastNameValid = false;
			boolean isCellNoValid = false;
			boolean isGmailValid = false;
			boolean isAgeValid = false;
			boolean isBloodGroup = false;
			
			if(nameIs != null){
				name=nameIs;
				isNameValid = true;
			}else{
				System.out.println("Please Provide Valid Name");
			}
			if(lastNameIs != null){
				lastName=lastNameIs;
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
			if(a >0){
				age = a;
				isAgeValid = true;
			}else{
				System.out.println("age NOT Valid");
			}
			if(bG !=null ){
				bloodGroup = bG;
				isBloodGroup = true;
			}else{
				System.out.println("enter valid blood group");
			}
			if( isNameValid && isLastNameValid && isCellNoValid && isGmailValid && isAgeValid && isBloodGroup){
				isLoginsuccess = true;
			}
			return isLoginsuccess;
	}

		public static void patientInfo(){
			
			System.out.println("user name is = "+name);
			System.out.println("user last name is= "+lastName);
			System.out.println("mobile number is = "+phoneNo);
			System.out.println("enter gmail = "+email);
			System.out.println("enter patient age is = "+age);
			System.out.println("enter petient blood group is= "+bloodGroup);
			
			
		}





}