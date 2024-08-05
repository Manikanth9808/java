package com.xworkz.agarbathi.dao;


import com.xworkz.agarbathi.dto.AgarbathiDto;

public class AgarbathiDao{

    AgarbathiDto dto;

    public boolean addDetails(AgarbathiDto dto) {
        boolean isDetailsValid = false;
        boolean isBrandNameValid = false;
        boolean isNoOfSticksValid = false;
        boolean isManifactureValid = false;
        boolean isExpireDateValid = false;
        boolean isPriceValid = false;
        boolean isIdValid = false;
        if (dto != null) {
            if (dto.brandName != null)
                isBrandNameValid = true;
            else System.out.println("the brand name is invalid");
            if (dto.noOfSticks > 0)
                isNoOfSticksValid = true;
            else System.out.println("the no of sticks not valid");
            if (dto.manifactureDate != null)
                isManifactureValid = true;
            else System.out.println("the manifacture date is nvalid");

            if (dto.price > 0)
                isPriceValid = true;
            else System.out.println("the price is invalid");

            if (dto.id > 0)
                isIdValid = true;
            else System.out.println("the id is invalid");
            if (dto.expireDate != null)
                isExpireDateValid = true;
            else System.out.println("the expoire date is invalid");
        }
        if (isBrandNameValid == true && isIdValid == true && isPriceValid == true && isExpireDateValid == true && isManifactureValid == true && isNoOfSticksValid == true){
            this.dto = dto;
        isDetailsValid = true;
    }

       else System.out.println("the given data is missing something");

       return isDetailsValid;

    }
    public void getDetails(){
    System.out.println("the brand name is "+dto.brandName);
    System.out.println("the no of sticks is "+dto.noOfSticks);
    System.out.println("the manifacture date is "+dto.manifactureDate);
    System.out.println("the expire date is "+dto.expireDate);
    System.out.println("the price is "+dto.price);
    System.out.println("the id is "+dto.id);
    }
}

