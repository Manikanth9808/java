package com.xworkz.swigy.DAO;
import com.xworkz.swigy.DTO.SwigyDto;
public class SwigyDao {
SwigyDto dto;

public boolean addDetails(SwigyDto dto){
    boolean isDetailsValid=false;
    boolean isNameValid=false;
    boolean isLocationValid=false;
    boolean isContactNumValid=false;
    boolean isAdditionalValid=false;
    boolean isOrderConfirmValid=false;

    if(dto !=null) {
        if (dto.name != null)
            isNameValid = true;
        else System.out.println("the name is invalid");

        if (dto.location != null)
            isLocationValid = true;
        else System.out.println("the location is valid");
        if (dto.contactNum > 0l)
            isContactNumValid = true;
        else System.out.println("the contact number is invalid");
        if (dto.additionNum > 0)
            isAdditionalValid = true;
        else System.out.println("the additional number is invalid");
        if (dto.isOrderConfirm != false)
            isOrderConfirmValid = true;
        else System.out.println("the order is not confirmed");

    }
    else System.out.println("provide valid details");

    if(isDetailsValid==false) {
        this.dto=dto;
        isDetailsValid = true;
    }
 else System.out.println("provide valid details");

 return isDetailsValid;
    }
    public void getDetails(){
    System.out.println("the customer name is "+dto.name);
        System.out.println("the location is "+dto.location);
        System.out.println("the contact number is "+dto.contactNum);
        System.out.println("the additional number is "+dto.additionNum);
        System.out.println("the order is confirm "+dto.isOrderConfirm);
}
}
