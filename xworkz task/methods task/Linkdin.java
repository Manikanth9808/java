class Linkdin{
static String name;
static String qualification;
static String address;
static boolean uploadResume;
static int   age;
static long  mobileNum;

public static void getJob(String n,String q,String a,boolean cV,int enterAge,long mNum){
name=n;
qualification=q;
address=a;
uploadResume=cV;
age=enterAge;
mobileNum=mNum;

System.out.println(" name is:"+name);
System.out.println("the qualification is:"+qualification);
System.out.println("the adress is:"+address);
System.out.println("the resume is uploaded:"+uploadResume);
System.out.println("age is :"+age);
System.out.println("the mobile number is:"+mNum);
}
}