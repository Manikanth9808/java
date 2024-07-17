class Facebook{
static String userName;
static String lastName;
static String db;
static long mobileNumber;
static String pass;

public static void login(String userN,String lastN,String dateOfBirth,long mN, String password){
userName=userN;
lastName=lastN;
db=dateOfBirth;
mobileNumber=mN;
pass=password;

System.out.println("the user name is:"+ userName);
System.out.println("the last name is:"+lastN);
System.out.println("the date of birth is:"+db);
System.out.println("the mobile number is:"+mN);
System.out.println("the password is:"+pass);
}
}