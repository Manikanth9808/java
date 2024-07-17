class Instagram{
static String userId;
static String userName;
static String createPass;
static String cnfPass;
static String captcha;

public static void instaLogin(String uId,String userN,String createP,String confirmP,String captch){
userId=uId;
userName=userN;
createPass=createP;
cnfPass=confirmP;
captcha=captch;

System.out.println(userId);
System.out.println(userName);
System.out.println(createPass);
System.out.println(cnfPass);
System.out.println(captcha);

}

}