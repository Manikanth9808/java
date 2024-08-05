package com.xworkz.park.dao;

import com.xworkz.park.dto.ParkDto;

public class ParkDao {

    ParkDto dto;
    public boolean getParkDetails(ParkDto dto){
    boolean isParkValid=false;

    if(null!=dto){
        this.dto=dto;
        isParkValid=true;
    }
    else System.out.println("connot find");
    return isParkValid;
    }



}
