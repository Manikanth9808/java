package com.xworkz.sunglass.dao;
import com.xworkz.sunglass.dto.SunGlassDto;
public class SunGlassDao {
    SunGlassDto dto;
    public boolean Details(SunGlassDto dto){
        boolean isSunGlassValid=false;
        if(null!=dto){
            this.dto=dto;
            isSunGlassValid=true;

        }
        return isSunGlassValid;
    }
}
