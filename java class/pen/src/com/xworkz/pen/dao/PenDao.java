package com.xworkz.pen.dao;
import com.xworkz.pen.dto.PenDto;
public class PenDao {
    PenDto dto;

    public boolean getDetails(PenDto dto){
        boolean isPenValid=false;
        if(null!=dto){
            this.dto=dto;
            isPenValid=true;
        }
        return isPenValid;
    }

}
