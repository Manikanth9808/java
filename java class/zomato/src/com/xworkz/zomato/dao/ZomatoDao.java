package com.xworkz.zomato.dao;
import com.xworkz.zomato.dto.ZomatoDto;
public  class ZomatoDao{

    ZomatoDto dto;

    public boolean addDetails(ZomatoDto dto){
        boolean isStatesValid=false;
        boolean isNameValid=false;
        boolean isOtpValid = false;
        boolean isMobileNumberValid = false;
        boolean isGmailValid = false;
        boolean isCaptchValid = false;
        if(dto !=null) {
            if (dto.name != null)
                isNameValid = true;

            else System.out.println("the name is invalid");

            if (dto.mobileNumber > 0)
                isMobileNumberValid = true;

            else System.out.println("the number is invalid");


            if (dto.otp > 0)
                isOtpValid = true;

            else System.out.println("the otp is invalid ");

            if (dto.gmail != null)
                isGmailValid = true;

            else System.out.println("the gmail is invalid");



            if (dto.captch != null)
                isCaptchValid = true;
            else System.out.println("captch invalid");
        }
        else System.out.println("the invalid");

         if(isStatesValid==false) {
            this.dto=dto;
             isStatesValid = true;
         }
        else System.out.println("the states are invalid");
        return isStatesValid;
        }
        public void getDetails(){
        System.out.println("the name is "+dto.name);
        System.out.println("the mobile number is "+dto.mobileNumber);
        System.out.println("the otp is "+dto.otp);
        System.out.println("the gmail is "+dto.gmail);
        System.out.println("the captch is "+dto.captch);
        }
    }


