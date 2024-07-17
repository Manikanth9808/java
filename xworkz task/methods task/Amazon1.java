class Amazon1{
static String userId;
static String lastName;
static String confirmAdress;
static String address;
static long mobileNumber;
static String pass;

public static boolean login(String userN,String lastN,String cAddress,String addr,long mN, String password){
boolean isLoginsuccess = false;
			boolean isUserIdValid = false;
			boolean isLastNameValid = false;
			boolean isConfirmAdress = false;
			boolean isAddress = false;
			boolean isMobileNumber = false;
			boolean ispass = false;
			
			if(userN != null){
				userId=userN;
				isUserIdValid = true;
			}else{
				System.out.println("Please Provide Valid  user id");
			}
			if(lastN != null){
				lastName=lastN;
				isLastNameValid = true;
			}else{
				System.out.println("Please Enter Last Name");
			}
			if(cAddress !=null){
				confirmAdress=cAddress;
				isConfirmAdress = true;
			}else{
				System.out.println("confrim address is not Valid");
			}
			if(addr != null){
				address=addr;
				isAddress = true;
			}else{
				System.out.println("Please Valid adress");
			}
			if(mN >0){
				mobileNumber=mN;
				isMobileNumber= true;
			}else{
				System.out.println("provide valid number");
			}
			if( password !=null ){
				pass = password;
				ispass = true;
			}else{
				System.out.println("enter valid password");
			}
			if( isUserIdValid && isLastNameValid && isConfirmAdress  && isAddress && isMobileNumber && ispass){
				isLoginsuccess = true;
			}
			return isLoginsuccess;
	}
public static void accountInfo(){
System.out.println("the user id is:"+ userId);
System.out.println("the last name is:"+lastName);
System.out.println("the home address is:"+address);
System.out.println("the confirm address is :"+confirmAdress);
System.out.println("the mobile number is:"+mobileNumber);
System.out.println("the password is:"+pass);
}
}