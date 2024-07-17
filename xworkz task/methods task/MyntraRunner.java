class MyntraRunner{

	public static void main(String[] newAccount){
		
	boolean name =Myntra.loginDetails("Manikanth","Pattar","hirapur","kalaburagi",9113036673L,"mani@1234");
	System.out.println(name);
		
		if(name ==true){
		       Myntra. accountInfo();
		}else{
			System.out.println("Provided Details Not Found");
		}
	}




}