package com.xworkz.blinkit.dao;

import com.xworkz.blinkit.dto.BlinkitDto;

public class BlinkitDao {
    BlinkitDto dto;

    public boolean allDetailsAdd(  BlinkitDto dtop){
        boolean isDetailsValid=false;
        boolean isNameValid=false;
        boolean isIdvalid=false;
        boolean isLastNameValid=false;
        boolean isOrderDateValid=false;

        if(dto!=null) {
            if (dto.name != null)
                isNameValid = true;
            else System.out.println("the  name is not valid");
            if (dto.lastName != null)
                isLastNameValid = true;
            else System.out.println("the last name isnt valid");
            if (dto.id > 0)
                isIdvalid = true;
            else System.out.println("the id is not valid");
            if (dto.orderDate != null)
                isOrderDateValid = true;
            else System.out.println("the order in not accept");
        }
        else System.out.println("provide valid details");
        if(isDetailsValid==false) {
            this.dto = dto;
            isDetailsValid = true;
        }
            return isDetailsValid;
        }
        public void getDetails(){
            System.out.println("the name is "+dto.name);
            System.out.println("the last name is "+dto.lastName);
            System.out.println("the id is "+dto.id);
            System.out.println("the order date is "+dto.orderDate);
    }
}
