class Bill{

static int billId= 101;
static String billDueDate= "26/06/2024";
satatic Stirng billIssueDate= "12/06/2024";
public static void main(String [] args){

Boolean isBillPaid= false;
Boolean isLatestBill= true;
String date= "14/06/2024";


System.out.println("the bill id isn:" + billId);
System.out.println("the bill issue date is: "+billIssueDate);
System.out.println("the bill due date is on:"+ billDueDate);
System.out.println(isLatestBill);
System.out.println(isBillPaid);
System.out.println("the bill date is:"+ date);
}
}
