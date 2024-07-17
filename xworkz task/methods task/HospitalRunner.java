class HospitalRunner{

	public static void main (String[] patientDetails){

		boolean isPatientRegistedSuccess = Hospital.patientDetails("Manikanth","M",208876898678L,"Manikanthpattar0@gmail.com",22,"B+");

		System.out.println(isPatientRegistedSuccess);
		if(isPatientRegistedSuccess == true){
			Hospital.patientInfo();
		}
		else{
			System.out.println("Given Details Not Found");
		}
	}	



}