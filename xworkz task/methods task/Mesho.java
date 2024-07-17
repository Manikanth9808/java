class Mesho{
static String userId;
static boolean cashOnDelivery;
static String confirmAdress;
static String address;
static long mobileNumber;
static String pass;

public static void login(String userN,boolean cOD,String cAddress,String addr,long mN, String password){
userId=userN;
cashOnDelivery=cOD;
confirmAdress=cAddress;
address=addr;
mobileNumber=mN;
pass=password;

System.out.println("the user id is:"+ userId);
System.out.println("cash on delivery:"+cashOnDelivery);
System.out.println("the home address is:"+address);
System.out.println("the confirm address is :"+confirmAdress);
System.out.println("the mobile number is:"+mN);
System.out.println("the password is:"+pass);
}
}