class Passport{
	static String cprLoc;
	static int dcdrLoc;
	static String giveN;
	static String db;
	static String em;
	static boolean isLogSameEmail;
	static String pass;
	static String confPass;
	static String hintQ;
	static String hintA;
	static String captcha;
	
public static boolean createPassport(String cprLocation,int dcdrLocation,String giveName,String dob,String email,boolean isLoginSameEmail,String password,String confPassword,String hintQues,String hintAns,String captch){

boolean isPassportCreated=false;
System.out.println("create passport started");
if(dcdrLocation >0 && giveName !=null && cprLocation !=null && dob !=null && email !=null && isLoginSameEmail ==true && password !=null && confPassword !=null && hintAns !=null && captch !=null ){
	

cprLoc=cprLocation;
dcdrLoc=dcdrLocation;
giveN=giveName;
db=dob;
em=email;
isLogSameEmail=isLoginSameEmail;
pass=password;
confPass=confPassword;
hintQ=hintQues;
hintA=hintAns;
captcha=captch;
isPassportCreated =true;
System.out.println("passport details are provided sucessful");
}
else{
	System.out.println("enter the valid value or data");
}
System.out.println("create passport ended");
return isPassportCreated;

}

public static void getPasswordDetails(){
System.out.println("the cpr location is:"+cprLoc);
System.out.println("the dcdr location is:"+dcdrLoc);
System.out.println("the given name is :"+giveN);
System.out.println("the date of birth is:"+db);
System.out.println("the emial id is:"+em);
System.out.println("the is login same :"+isLogSameEmail);
System.out.println("the password is:"+pass);
System.out.println("the confirm password is:"+confPass);
System.out.println("the hiden question is:"+hintQ);
System.out.println("the hiden ans is:"+hintA);
System.out.println("the captcha is: "+captcha);
}
}