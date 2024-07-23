class AccountDetails{
String accountHolderName;
int customerId;
String bankName;
String branchName;
long accountNumber;
String ifscCode;
String address;
String accountType;

public boolean createAccount(String accountHolderName,int customerId,String bankName,String branchName,long accountNumber,String ifscCode,String address,String accountType){

boolean isAccountValid=false;
boolean isAccountHolderNameValid=false;
boolean isCustomerIdValid=false;
boolean isBankNameValid=false;
boolean isBranchNameValid=false;
boolean isAccountNumberValid=false;
boolean isIfscCodeValid=false;
boolean isAddressValid=false;
boolean isAccountTypeValid=false;

if(accountHolderName !=null){
this.accountHolderName=accountHolderName;
isAccountHolderNameValid=true;
}
if(customerId>0){
this.customerId=customerId;
isCustomerIdValid=true;
}
if(bankName!=null){
this.bankName=bankName;
isBankNameValid=true;
}
if(branchName!=null){
this.branchName=branchName;
isBranchNameValid=false;
}
if(accountNumber>0){
this.accountNumber=accountNumber;
isAccountNumberValid=true;
}
if(ifscCode!=null){
this.ifscCode=ifscCode;
isIfscCodeValid=true;
}
if(address!=null){
this.address=address;
isAddressValid=true;
}
if(accountType!=null){
this.accountType=accountType;
isAccountTypeValid=true;
}
if(isAccountValid==false){
	isAccountValid=true;
}
else
System.out.println("invalid ");

return isAccountValid;
}
public void getAccountDetails(){
System.out.println("the account holder name is:"+this.accountHolderName);
System.out.println("the customer id is:"+this.customerId);
System.out.println("the bank name is:"+this.bankName);
System.out.println("the branch name is:"+this.branchName);
System.out.println("the account number is:"+this.accountNumber);
System.out.println("the ifsc code is:"+this.ifscCode);
System.out.println("the address is:"+this.address);
System.out.println("the account type is:"+this.accountType);
}
}