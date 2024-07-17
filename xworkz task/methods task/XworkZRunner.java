class XworkZRunner{


	public static void main (String[] Details){

		boolean istRegisted = XworkZ.login("Manikanth","chanveera","channu","shiva","prasad");

		System.out.println(istRegisted);
		if(istRegisted == true){
			XworkZ.accountInfo();
		}
		else{
			System.out.println("Given Details Not Found");
		}
	}	



}