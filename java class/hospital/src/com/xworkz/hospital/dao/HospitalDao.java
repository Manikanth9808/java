package com.xworkz.hospital.dao;

import com.xworkz.hospital.dto.HospitalDto;

public class HospitalDao {
    HospitalDto dto;
    public boolean addPetientDetails(HospitalDto dto){
        boolean isAddDetails=false;
        boolean isNameValid=false;
        boolean isPetientIdValid=false;
        boolean isAdmitDateValid=false;
        boolean isDischargeDateValid=false;
        boolean isBillValid=false;

        if(dto !=null){
            if(dto.patientName!=null)
                isPetientIdValid=true;
            else System.out.println("name is invalid");
            if(dto.petientId>0)
                isPetientIdValid=true;
            else System.out.println("id is invalid");
            if(dto.admitDate !=null)
                isAdmitDateValid=true;
            else System.out.println("the admit date is invalid");
            if(dto.dischargeDate!=null)
                isDischargeDateValid=true;
            else System.out.println("the discharge date is invalid");
            if(dto.bill>0)
                isBillValid=true;
            else System.out.println("bill is invalid");

        }
        else System.out.println("provide valid details");
        if(isAddDetails==false)
            this.dto=dto;
        isAddDetails=true;
        return isAddDetails;
    }
    public void getDetails(){
        System.out.println("the patient  name is "+dto.patientName);
        System.out.println("the patient id is "+dto.petientId);
        System.out.println("the admit date is "+dto.admitDate);
        System.out.println("the discharge date is "+dto.dischargeDate);
        System.out.println("the total bill is "+dto.bill);
    }
}
