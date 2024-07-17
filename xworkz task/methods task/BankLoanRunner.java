class BankLoanRunner{

public static void main(String[] args){

boolean name=Loan.getLoan(646351874,"SBI",7.5f,"2%","personal");
System.out.println(name);
if(name ==true){
	
Loan.getData1();
}
else{
	System.out.println("the details not provide");
}
}
}