class BankAccount{
static double balance;
public static void debit(double amount){
System.out.println("debit started");
if(amount<=balance)
balance=balance-amount;
System.out.println(balance);
else

System.out.println("insffient balance");

System.out.println("debit ended");
}

public static void credit(double amount){
System.out.println("creadit started");
if(amount>0)
balance=balance+amount;
else
System.out.println("amount cant be zero");
}
public static void getBalance(){
System.out.println("fetching the bank balance"+balance);
}
}