class XworkZ{
static String name1;
static String name2;
static String name3;
static String name4;
static String name5;


public static boolean login(String N1,String N2,String N3,String N4,String N5){
boolean isLoginsuccess = false;
			boolean isLastName1Valid = false;
			boolean isLastName2Valid = false;
			boolean isLastName3Valid= false;
			boolean isLastName4Valid = false;
			boolean isLastName5Valid= false;
			
			
			if(N1 != null){
				name1=N1;
				isLastName1Valid = true;
			}else{
				System.out.println("Please Provide Valid  user id");
			}
			if(N2 != null){
				name2=N2;
				isLastName2Valid = true;
			}else{
				System.out.println("Please Enter Last Name");
			}
			if(N3 !=null){
				name3=N3;
				isLastName3Valid = true;
			}else{
				System.out.println("confrim address is not Valid");
			}
			if(N4 != null){
				name4=N4;
				isLastName4Valid = true;
			}else{
				System.out.println("Please Valid adress");
			}
			
			if(N5 != null ){
				name5 = N5;
				isLastName5Valid = true;
			}else{
				System.out.println("enter valid password");
			}
			if( isLastName1Valid  && isLastName2Valid  && isLastName3Valid   && isLastName4Valid  && isLastName5Valid  ){
				isLoginsuccess = true;
			}
			return isLoginsuccess;
	}
public static void accountInfo(){
System.out.println("the 1st name is:"+ name1);
System.out.println("the 2nd name is:"+name2);
System.out.println("the 3rd name is:"+name3);
System.out.println("the 4th name is :"+name4);
System.out.println("tthe 5th name is:"+name5);

}
}