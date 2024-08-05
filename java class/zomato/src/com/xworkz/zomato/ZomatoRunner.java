package com.xworkz.zomato;
import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.dao.ZomatoDao;
class ZomatoRunner{

    public static void main(String[] args){

        ZomatoDto ref=new ZomatoDto();
        ref.name="mani";
        ref.mobileNumber=9741095169l;
        ref.otp=4563;
        ref.gmail="manikanthpattar0@gmail.com";
        ref.captch="AvkiX";

        ZomatoDao ref1= new ZomatoDao();
        ref1.addDetails(ref);
        ref1.getDetails();

    }
}