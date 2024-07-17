class StudyCertificate{
static String name;
static String fatherName;
static int age;
static String schholName;
static String standard;
static long mobileNumber;


public static void education(String userN,String fatherN,int a,String name,String batch, long mobile){
name=userN;
fatherName=fatherN;
age=a;
schholName=name;
mobileNumber=mobile;
standard=batch;

System.out.println("the name is:"+ name);
System.out.println("the father name is:"+fatherName);

System.out.println("the age is :"+age);
System.out.println("the school name  is:"+schholName);
System.out.println("the  mobile number is:"+mobileNumber);
System.out.println("the batch is:"+standard);
}
}