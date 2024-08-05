package com.xworkz.instagram.dao;
import com.xworkz.instagram.dto.InstagramDto;
public class InstagramDao {
    InstagramDto dto;

    public boolean getDetails(InstagramDto dto){
        boolean isInstaValid=false;
        if(null!=dto){
            this.dto=dto;
            isInstaValid=true;
        }
        else
            System.out.println("invalid");
        return isInstaValid;
    }

}
