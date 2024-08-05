package com.xworkz.simcard.dao;
import com.xworkz.simcard.dto.SimCardDto;
public class SimCardDao {
    SimCardDto dto;


    public boolean details(SimCardDto dto){
        boolean isSimValid=false;
        if(null!=dto){
            this.dto=dto;
            isSimValid=true;

        }
        return isSimValid;

    }

}
