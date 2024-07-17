class Loan{
static int bankAccountNo;
static String bankName;
static float  creaditScore;
static String doubleRO;
static String loanType;
public static boolean getLoan(int bankAccount,String bankN, float creaditS, String dRO, String loanT){
boolean isAccountcreated=false;
 boolean isAccountNoValid=false;
 boolean isBankNameValid=false;
 boolean isValidCreaditScore=false;
 boolean isDoubleROvalid=false;
 boolean isLoanTypeValid=false;
 
 if(bankAccount>0){
 bankAccountNo=bankAccount;
 isAccountNoValid=true;
 }
 else{
 System.out.println("please provide valid account number");
 }
 if(bankN !=null){
 bankName=bankN;
 isBankNameValid=true;
 }
 else{
 System.out.println("please provide valid account name");
 }
 if(creaditS >7.0f){
  creaditScore=creaditS;
  isValidCreaditScore=true;
  
 }
 else{
 System.out.println(" creadit score is not enough");
 }
 if(dRO !=null)
{
doubleRO=dRO;
isDoubleROvalid=true;
}
else{
System.out.println("provide valid %");
}
if(loanT !=null){
loanType=loanT;
isLoanTypeValid=true;
}
else{
	System.out.println("provide current loan type:");
}
if(isAccountNoValid && isBankNameValid && isValidCreaditScore && isDoubleROvalid && isLoanTypeValid){
	isAccountcreated=true;
}
else{
	System.out.println("try again");
}
return isAccountcreated;
}
public static void getData1(){
	System.out.println("the bank account number is:"+bankAccountNo);
	System.out.println("the bank name is :"+bankName);
	System.out.println("the valid creadit score is:"+creaditScore);
	System.out.println("the double rate intrest is:"+doubleRO);
	System.out.println("the load type is:"+loanType);
}
}