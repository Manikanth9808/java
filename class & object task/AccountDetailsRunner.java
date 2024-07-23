class AccountDetailsRunner{
public static void main(String[] args){
AccountDetails ref=new AccountDetails();

boolean name=ref.createAccount("manikanth pattar",3356323,"indian bank","super market kalaburagi",35589847738l,"INDI22923","kalaburagi","savings");
ref.getAccountDetails();
}
}